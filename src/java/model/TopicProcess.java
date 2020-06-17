/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Entity.Course;
import Entity.Topic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class TopicProcess {
    public Connection getConnection()
    {
        Connection conn=null;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //khai bao cac thong so ket noi
            String url="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=assignment";
            String user="sa";
            String pass="12345";
            try {
                //Lay ve ket noi
                conn=DriverManager.getConnection(url, user, pass);
            } catch (SQLException ex) 
            {
                Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return conn;
    }
    public List<Topic> getList()
   {
       String sql = "SELECT * FROM tblTopic";
       List<Topic> list = new ArrayList<Topic>();
        try {
            PreparedStatement prst=getConnection().prepareStatement(sql);
            ResultSet rs=prst.executeQuery();
            while(rs.next())
            {
                String id=rs.getString(1);
                String name = rs.getString(2);
                String des=rs.getString(3);
                Topic topic =new Topic(id, name, des);
                list.add(topic);
//                Topic t= new Topic();
//                t.setId(rs.getString(1));
//                t.setName(rs.getString(2));
//                t.setDes(rs.getString(3));
//                
//                list.add(t);
                
            }
            
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list;
   }
    public boolean addTopic(String id, String name, String des)
    {
        
        int result=0;
        String sql="INSERT INTO tblTopic VALUES(?,?,?)";
       try {
            PreparedStatement prst=getConnection().prepareStatement(sql);
            prst.setString(1, id);
            prst.setString(2, name);
            prst.setString(3, des);
            
            result=prst.executeUpdate();
            prst.close();
       } 
       catch (SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return result>0;
        }
    
    public Vector<Topic> getData()
   {
       Vector<Topic> v = new Vector<Topic>();
       String sql="SELECT*FROM tblTopic";
       try{
           ResultSet rs=getConnection().createStatement().executeQuery(sql);
           while(rs.next())
           {
               
               Topic temp=new Topic();
               temp.setId(rs.getString(1));
               temp.setName(rs.getString(2));
               temp.setDes(rs.getString(3));
               
               
               v.add(temp);
           }
           rs.close();
       }
       catch(SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return v;
   }
    public boolean deleteTopic(String id) 
   {
       int result=0;
       String sql="DELETE From tblTopic Where topicid=?";
       try{
       PreparedStatement prst=getConnection().prepareStatement(sql);
       prst.setString(1, id);
       result=prst.executeUpdate();
       prst.close();
       }
       catch(SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return result>0;
   }
   public Topic getById(String id) 
   {
       Topic temp=null;
       String sql="SELECT *FROM tblTopic WHERE topicid=?";
       try
       {
       PreparedStatement prst=getConnection().prepareStatement(sql);
       prst.setString(1, id);
       ResultSet rs=prst.executeQuery();
       while(rs.next())
       {
           temp =new Topic(rs.getString(1),rs.getString(2), rs.getString(3));
       }
       rs.close();
       }
       catch(SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return temp;
   }
   public boolean updateTopic(String id, String name, String des)
   {
       String sql="UPDATE tblTopic SET name= ?,des = ? WHERE topicid=?";
       int result=0;
       try{
            PreparedStatement prst=getConnection().prepareStatement(sql);
            
            prst.setString(1, name);
            prst.setString(2, des);
            
            prst.setString(3, id);
            
            result=prst.executeUpdate();
            
       }
       catch (SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return result>0;
   }
}
