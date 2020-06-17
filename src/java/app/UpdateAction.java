/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Course;
import com.opensymphony.xwork2.ActionSupport;
import model.DataProcess;

/**
 *
 * @author DELL 3578
 */
public class UpdateAction extends ActionSupport {
private String id;
    private String topic;
    private String cate;
     private String name;
     private String startdate;
     private String enddate;
     private String fee;
    private String time;
      private String location;
      private String des;
      private String trainer;

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
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

    
    
    public UpdateAction() {
    }
    
    public String execute() throws Exception {
       DataProcess dt=new DataProcess();
       Course c=dt.getById(id);
       
        setId(c.getId());
        setTopic(c.getTopic());
        setCate(c.getCate());
        
        setName(c.getName());
        setStartdate(c.getStartdate());
        setEnddate(c.getEnddate());
        setFee(c.getFee());
        setTime(c.getTime());
        setLocation(c.getLocation());
        setDes(c.getDes());
        setTrainer(c.getTrainer());
        return "SUCCESS";
    }
    
}
