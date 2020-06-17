/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Account;
import Entity.Course;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;
import model.DataProcess;


/**
 *
 * @author DELL 3578
 */
public class addAction extends ActionSupport {
    
    String id;
    String topic;
    String cate;
    String name;
    String startdate;
    String enddate;
    String fee;
    String time;
    String location;
    String des;
    String trainer;

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }
    
    private List<Course> list;
    public addAction() 
    {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
    

    public List<Course> getList() {
        return list;
    }

    public void setList(List<Course> list) {
        this.list = list;
    }
    
   
    public String execute() throws Exception {
        DataProcess dt=new DataProcess();
        if(dt.addCourse(id, cate, topic,name,startdate,enddate,fee,time, location, des, trainer))
        {
            list=dt.getList();
            return "SUCCESS";
        }
        else
        {
              return"FALSE";  
        }
    }

    
    
}
