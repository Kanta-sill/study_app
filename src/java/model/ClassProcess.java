/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Entity.Classs;
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
public class ClassProcess {
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
    public List<Classs> getList()
   {
       String sql = "SELECT * FROM tblClass";
       List<Classs> list = new ArrayList();
        try {
            PreparedStatement prst=getConnection().prepareStatement(sql);
            ResultSet rs=prst.executeQuery();
            while(rs.next())
            {
                
                Classs ca= new Classs();
                ca.setCourse(rs.getString(1));
                ca.setTrainee(rs.getString(2));
                
                
                list.add(ca);
                
            }
            
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list;
   }
    public Vector<Classs> getData()
   {
       Vector<Classs> v = new Vector<Classs>();
       String sql="SELECT * FROM tblClass";
       try{
           ResultSet rs=getConnection().createStatement().executeQuery(sql);
           while(rs.next())
           {
               
               Classs temp=new Classs();
               temp.setCourse(rs.getString(1));
               temp.setTrainee(rs.getString(2));
               
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
    public boolean addClass(String course, String trainee)
    {
        
        int result=0;
        String sql="INSERT INTO tblClass VALUES(?,?)";
       try {
            PreparedStatement prst=getConnection().prepareStatement(sql);
            prst.setString(1, course);
            prst.setString(2, trainee);
            
            result=prst.executeUpdate();
            prst.close();
       } 
       catch (SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return result>0;
        }
    public boolean addAssignTrainee1(String trainee, String course)
    {
        
        int result=0;
        String sql="INSERT INTO tblClass VALUES(?,?)";
       try {
            PreparedStatement prst=getConnection().prepareStatement(sql);
            
            prst.setString(1, course);
            prst.setString(2, trainee);
            result=prst.executeUpdate();
            prst.close();
       } 
       catch (SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return result>0;
        }
    public Vector<Classs> getDataAssign(String id)
   {
       Vector<Classs> v = new Vector<Classs>();
       String sql="SELECT * FROM tblClass where course=?";
       try{
           PreparedStatement prst=getConnection().prepareStatement(sql);
           prst.setString(1, id);
           ResultSet rs=prst.executeQuery();
           while(rs.next())
           {
               
               Classs temp=new Classs();
               temp.setCourse(rs.getString(1));
               temp.setTrainee(rs.getString(2));
               
               
               
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
    public boolean deleteClass(String course, String trainee) 
   {
       int result=0;
       String sql="DELETE FROM tblClass WHERE course=? and trainee=?";
       try{
       PreparedStatement prst=getConnection().prepareStatement(sql);
       prst.setString(1, course);
       prst.setString(2, trainee);
       result=prst.executeUpdate();
       prst.close();
       }
       catch(SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return result>0;
   }
}
