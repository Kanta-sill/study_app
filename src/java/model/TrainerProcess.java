/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Entity.Trainer;
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
public class TrainerProcess {
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
    public Vector<Trainer> getData()
   {
       Vector<Trainer> v = new Vector<Trainer>();
       String sql="SELECT*FROM tblTrainer";
       try{
           ResultSet rs=getConnection().createStatement().executeQuery(sql);
           while(rs.next())
           {
               
               Trainer temp=new Trainer();
               temp.setId(rs.getString(1));
               temp.setName(rs.getString(2));
               temp.setAccount(rs.getString(3));
               temp.setAge(rs.getString(4));
               temp.setDot(rs.getString(5));
               temp.setExin(rs.getString(6));
               temp.setEdu(rs.getString(7));
               temp.setPlacework(rs.getString(8));
               temp.setEmail(rs.getString(9));
               temp.setToeic(rs.getString(10));
               temp.setDepart(rs.getString(11));
               temp.setLocation(rs.getString(12));
               temp.setExp(rs.getString(13));
               
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
    public Trainer getById(String u) 
   {
       Trainer temp=null;
       String sql="SELECT *FROM tblTrainer WHERE tblTrainer.account=?";
       try
       {
       PreparedStatement prst=getConnection().prepareStatement(sql);
       prst.setString(1, u);
       ResultSet rs=prst.executeQuery();
       while(rs.next())
       {
           temp =new Trainer(rs.getString(1),rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13));
       }
       rs.close();
       }
       catch(SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return temp;
   }
   public boolean updateTrainer(String id, String name, String account,String age,String dot,String exin,String edu,String placework,String email,String toeic,String depart,String location,String exp)
   {
       String sql="UPDATE tblTrainer SET name= ?,account = ?,age=?,dot=?,ex_in=?,edu=?,placework=?,email=?,toeic=?,depart=?,location=?,expdetail=? WHERE trainerid=?";
       int result=0;
       try{
            PreparedStatement prst=getConnection().prepareStatement(sql);
            
            prst.setString(1, name);
            prst.setString(2, account);
            prst.setString(3, age);
            prst.setString(4, dot);
            prst.setString(5, exin);
            
            prst.setString(6, edu);
            prst.setString(7, placework);
            prst.setString(8, email);
            prst.setString(9, toeic);
            prst.setString(10, depart);
            
            prst.setString(11, location);
            prst.setString(12, exp);
            
            prst.setString(13, id);
            
            result=prst.executeUpdate();
            
       }
       catch (SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return result>0;
   }
   
}
