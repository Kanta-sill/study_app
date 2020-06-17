/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Entity.Category;
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
public class CateProcess {
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
    public List<Category> getList()
   {
       String sql = "SELECT * FROM tblCategory";
       List<Category> list = new ArrayList();
        try {
            PreparedStatement prst=getConnection().prepareStatement(sql);
            ResultSet rs=prst.executeQuery();
            while(rs.next())
            {
                
                Category ca= new Category();
                ca.setId(rs.getString(1));
                ca.setName(rs.getString(2));
                ca.setDes(rs.getString(3));
                
                list.add(ca);
                
            }
            
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list;
   }
    public boolean addCate(String id, String name, String des)
    {
        
        int result=0;
        String sql="INSERT INTO tblCategory VALUES(?,?,?)";
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
    
    public Vector<Category> getData()
   {
       Vector<Category> v = new Vector<Category>();
       String sql="SELECT*FROM tblCategory";
       try{
           ResultSet rs=getConnection().createStatement().executeQuery(sql);
           while(rs.next())
           {
               
               Category temp=new Category();
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
    public boolean deleteCate(String id) 
   {
       int result=0;
       String sql="DELETE From tblCategory Where cateID=?";
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
   public Category getById(String id) 
   {
       Category temp=null;
       String sql="SELECT *FROM tblCategory WHERE cateID=?";
       try
       {
       PreparedStatement prst=getConnection().prepareStatement(sql);
       prst.setString(1, id);
       ResultSet rs=prst.executeQuery();
       while(rs.next())
       {
           temp =new Category(rs.getString(1),rs.getString(2), rs.getString(3));
       }
       rs.close();
       }
       catch(SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return temp;
   }
   public boolean updateCate(String id,String name, String des)
   {
       String sql="UPDATE tblCategory SET name= ?,des = ? WHERE cateID=?";
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
