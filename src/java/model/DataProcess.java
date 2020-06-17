/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import Entity.Account;
import Entity.Course;
import Entity.Topic;
import Entity.Trainee;
import app.addAction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL 3578
 */
public class DataProcess {

    
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

    public boolean checkLogin(String u,String p)
    {
        boolean f =false;
        String sql= "SELECT * FROM tblAccount WHERE _user=? and _pass=?";
        Connection conn=getConnection();
        try {
            PreparedStatement prst=conn.prepareStatement(sql);
            prst.setString(1,u);
            prst.setString(2,p);
            
            ResultSet rs=prst.executeQuery();//sql data reader
            f=rs.next();
            
            rs.close();
            prst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return f;
    }
    public boolean checkLoginAdmin(String u,String p)
    {
        boolean f =false;
        String sql= "SELECT * FROM tblAccount WHERE _user=? and _pass=? and role='admin'";
        Connection conn=getConnection();
        try {
            PreparedStatement prst=conn.prepareStatement(sql);
            prst.setString(1,u);
            prst.setString(2,p);
            
            ResultSet rs=prst.executeQuery();//sql data reader
            f=rs.next();
            
            rs.close();
            prst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return f;
    }
    public boolean checkLoginTrainer(String u,String p)
    {
        boolean f =false;
        String sql= "SELECT * FROM tblAccount WHERE _user=? and _pass=? and role='trainer'";
        Connection conn=getConnection();
        try {
            PreparedStatement prst=conn.prepareStatement(sql);
            prst.setString(1,u);
            prst.setString(2,p);
            
            ResultSet rs=prst.executeQuery();//sql data reader
            f=rs.next();
            
            rs.close();
            prst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return f;
    }
    public String checkRole(String u){
        String role = null;
        String sql = "SELECT tblAccount.role FROM tblAccount where _user=?";
        Connection conn=getConnection();
        PreparedStatement prst;
        try {
            prst = conn.prepareStatement(sql);
            prst.setString(1,u);
            
            ResultSet rs=getConnection().createStatement().executeQuery(sql);
            role=rs.getString(1);
            rs.close();
            prst.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return role;
    }
   public ArrayList<Account> getAccountData()         
   {
    ArrayList<Account> list=new ArrayList<Account>();
    String sql = "SELECT * FROM tblAccount";
    Connection conn = getConnection();
    try
    {
    Statement prst = conn.createStatement();
    ResultSet rs = prst.executeQuery(sql);
    while(rs.next())
            {
                Account acc=new Account();
                acc.setUser(rs.getString(1));
                acc.setPass(rs.getString(2));
                list.add(acc);
            }
    rs.close();
    prst.close();
    conn.close();
    
    }catch (SQLException ex)
    {
        Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
    }
    return list;
}
   public List<Course> getList()
   {
       String sql = "SELECT * FROM tblCourse";
       List<Course> list = new ArrayList();
        try {
            PreparedStatement prst=getConnection().prepareStatement(sql);
            ResultSet rs=prst.executeQuery();
            while(rs.next())
            {
                
                Course c= new Course();
                c.setId(rs.getString(1));
                c.setName(rs.getString(4));
                c.setTopic(rs.getString(3));
                c.setStartdate(rs.getString(5));
                c.setEnddate(rs.getString(6));
                c.setLocation(rs.getString(9));
                c.setDes(rs.getString(10));
                c.setTrainer(rs.getString(11));
                list.add(c);
                
            }
            
            prst.close();
        } catch (SQLException ex) {
            Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
        }
       return list;
   }
 public boolean addCourse(String id, String topic, String cate, String name, String startdate,String enddate,String fee,String time, String location, String des, String trainer)
    {
        
        int result=0;
        String sql="INSERT INTO tblCourse VALUES(?,?,?,?,?, ?,?,?,?,? ,?)";
       try {
            PreparedStatement prst=getConnection().prepareStatement(sql);
            prst.setString(1, id);
            prst.setString(2, topic);
            prst.setString(3, cate);
            prst.setString(4, name);
            prst.setString(5, startdate);
            
            prst.setString(6, enddate);
            prst.setString(7, fee);
            prst.setString(8, time);
            prst.setString(9, location); 
            prst.setString(10, des);
            
            prst.setString(11, trainer);
            result=prst.executeUpdate();
            prst.close();
       } 
       catch (SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return result>0;
        }
   public boolean updateCourse(String id, String topic, String cate, String name, String startdate,String enddate,String fee,String time, String location, String des, String trainer)
   {
       String sql="UPDATE tblCourse SET catename=?,topicname=?,name = ?,startdate = ?,enddate=?,fee=?,time=?,place= ?,des = ?, trainer=? WHERE courseid=?";
       int result=0;
       try{
            PreparedStatement prst=getConnection().prepareStatement(sql);
            
            prst.setString(1, cate);
            prst.setString(2, topic);
            prst.setString(3, name);
            prst.setString(4, startdate);
            prst.setString(5, enddate);
            prst.setString(6, fee);
            prst.setString(7, time);
            prst.setString(8, location);
            prst.setString(9, des);
            prst.setString(10, trainer);
            prst.setString(11, id);
            
            
            result=prst.executeUpdate();
            
       }
       catch (SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return result>0;
   }
   public boolean deleteCourse(String id) 
   {
       int result=0;
       String sql="DELETE From tblCourse Where courseID=?";
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
   
   public Course getById(String id) 
   {
       Course temp=null;
       String sql="SELECT * FROM tblCourse WHERE courseID=?";
       try
       {
       PreparedStatement prst=getConnection().prepareStatement(sql);
       prst.setString(1, id);
       ResultSet rs=prst.executeQuery();
       while(rs.next())
       {
           temp =new Course(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10), rs.getString(11));
       }
       rs.close();
       }
       catch(SQLException ex)
       {
           Logger.getLogger(DataProcess.class.getName()).log(Level.SEVERE, null, ex);
       }
       return temp;
   }
   
   
   public Vector<Course> getByName(String name) 
   {
       Vector<Course> v = new Vector<Course>();
       
       String sql="SELECT * FROM tblCourse WHERE tblCourse.name like ?";
       try
       {
       PreparedStatement prst=getConnection().prepareStatement(sql);
       prst.setString(1, name);
       ResultSet rs=prst.executeQuery();
       while(rs.next())
       {
           
               Course temp=new Course();
               temp.setId(rs.getString(1));
               
               
               temp.setCate(rs.getString(2));
               temp.setTopic(rs.getString(3));
               temp.setName(rs.getString(4));
               temp.setStartdate(rs.getString(5));
               temp.setEnddate(rs.getString(6));
               temp.setFee(rs.getString(7));
               temp.setTime(rs.getString(8));
               temp.setLocation(rs.getString(9));
               temp.setDes(rs.getString(10));
               temp.setTrainer(rs.getString(11));
               
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

   public Vector<Course> getData()
   {
       Vector<Course> v = new Vector<Course>();
//       String sql="SELECT courseid FROM tblCourse"
//               + "SELECT name FROM tblTopic"
//               + "SELECT name FROM tblCate"
//               + "SELECT name, startdate, enddate, fee, time, place, des FROM tblCourse";
       String sql="SELECT * FROM tblCourse";
       try{
           ResultSet rs=getConnection().createStatement().executeQuery(sql);
           while(rs.next())
           {
               
               Course temp=new Course();
               
               temp.setId(rs.getString(1));
               
               
               temp.setCate(rs.getString(2));
               temp.setTopic(rs.getString(3));
               temp.setName(rs.getString(4));
               temp.setStartdate(rs.getString(5));
               temp.setEnddate(rs.getString(6));
               temp.setFee(rs.getString(7));
               temp.setTime(rs.getString(8));
               temp.setLocation(rs.getString(9));
               temp.setDes(rs.getString(10));
               temp.setTrainer(rs.getString(11));
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
   public Vector<Course> getDataView()
   {
       Vector<Course> v = new Vector<Course>();

       String sql="SELECT tblCourse.courseid, tblCategory.name, tblTopic.name, tblCourse.name, tblCourse.startdate, tblCourse.enddate from tblCourse inner join tblCategory on tblCourse.catename=tblCategory.cateID inner join tblTopic on tblTopic.topicID=tblCourse.topicname";
       try{
           ResultSet rs=getConnection().createStatement().executeQuery(sql);
           while(rs.next())
           {
               
               Course temp=new Course();
               
               temp.setId(rs.getString(1));
               
               temp.setCate(rs.getString(2));
               temp.setTopic(rs.getString(3));
               temp.setName(rs.getString(4));
               temp.setStartdate(rs.getString(5));
               temp.setEnddate(rs.getString(6));
               
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
    public Vector<Course> getDataTrainer(String account)
   {
       Vector<Course> v = new Vector<Course>();

       String sql="SELECT tblCourse.courseid, tblCourse.name, tblCourse.startdate, tblCourse.enddate, tblCourse.time, tblCourse.place from tblCourse inner join tblTrainer on tblCourse.trainer=tblTrainer.trainerid where tblTrainer.account=?";
       
       try{
           PreparedStatement prst=getConnection().prepareStatement(sql);
           prst.setString(1, account);
           ResultSet rs=prst.executeQuery();
           
           while(rs.next())
           {
               Course temp=new Course();
               
               temp.setId(rs.getString(1));
               temp.setName(rs.getString(2));
               temp.setStartdate(rs.getString(3));
               temp.setEnddate(rs.getString(4));
               temp.setTime(rs.getString(5));
               temp.setLocation(rs.getString(6));
               
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




