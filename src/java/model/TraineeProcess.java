/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Entity.Trainee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class TraineeProcess {
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
    public Vector<Trainee> getData()
   {
       Vector<Trainee> v = new Vector<Trainee>();
       String sql="SELECT tblTrainee.traineeid, tblTrainee.name, tblTrainee.email FROM tblTrainee";
       try{
           ResultSet rs=getConnection().createStatement().executeQuery(sql);
           while(rs.next())
           {
               
               Trainee temp=new Trainee();
               temp.setId(rs.getString(1));
               temp.setName(rs.getString(2));
               temp.setEmail(rs.getString(3));
               
               
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
    public Vector<Trainee> getDataAssign(String id)
   {
       Vector<Trainee> v = new Vector<Trainee>();
       String sql="SELECT tblTrainee.traineeid, tblTrainee.name, tblTrainee.email FROM tblTrainee where tblTrainee.traineeid=?";
       try{
           PreparedStatement prst=getConnection().prepareStatement(sql);
           prst.setString(1, id);
           ResultSet rs=prst.executeQuery();
           while(rs.next())
           {
               
               Trainee temp=new Trainee();
               temp.setId(rs.getString(1));
               temp.setName(rs.getString(2));
               temp.setEmail(rs.getString(3));
               
               
               
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
    public Vector<Trainee> getDataSearch(String name)
   {
       Vector<Trainee> v = new Vector<Trainee>();
       String sql="SELECT tblTrainee.traineeid, tblTrainee.name, tblTrainee.email FROM tblTrainee where tblTrainee.name like ?";
       try{
           PreparedStatement prst=getConnection().prepareStatement(sql);
           prst.setString(1, name);
           ResultSet rs=prst.executeQuery();
           while(rs.next())
           {
               
               Trainee temp=new Trainee();
               temp.setId(rs.getString(1));
               temp.setName(rs.getString(2));
               temp.setEmail(rs.getString(3));
               
               
               
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
    public Vector<Trainee> getDetailAssign(String id)
   {
       Vector<Trainee> v = new Vector<Trainee>();
       String sql="select tblClass.trainee, tblTrainee.name, tblTrainee.email from tblTrainee inner join tblClass on tblTrainee.traineeid=tblClass.trainee where tblClass.course=?";
       try{
           PreparedStatement prst=getConnection().prepareStatement(sql);
           prst.setString(1, id);
           ResultSet rs=prst.executeQuery();
           while(rs.next())
           {
               
               Trainee temp=new Trainee();
               temp.setId(rs.getString(1));
               temp.setName(rs.getString(2));
               temp.setEmail(rs.getString(3));
               
               
               
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
    public Vector<Trainee> ViewClass()
   {
       Vector<Trainee> v = new Vector<Trainee>();
       String sql="  select tblClass.course, tblCourse.name, tblTrainee.name, tblTrainee.email from tblClass inner join tblCourse on tblClass.course=tblCourse.courseid inner join tblTrainee on tblClass.trainee=tblTrainee.traineeid";
       try{
           ResultSet rs=getConnection().createStatement().executeQuery(sql);
           while(rs.next())
           {
               
               Trainee temp=new Trainee();
               temp.setId(rs.getString(1));
               temp.setName(rs.getString(2));
               temp.setEmail(rs.getString(3));
               temp.setLocation(rs.getString(4));
               
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
}
