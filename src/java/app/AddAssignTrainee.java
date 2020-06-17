/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Classs;
import Entity.Trainee;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import model.ClassProcess;
import model.TraineeProcess;

/**
 *
 * @author Admin
 */
public class AddAssignTrainee extends ActionSupport {
    
    private String course;
    private String trainee;
    private List<Classs> list;
    private Vector<Trainee> items;
    private Vector<Trainee> item;

    public Vector<Trainee> getItem() {
        return item;
    }

    public void setItem(Vector<Trainee> item) {
        this.item = item;
    }
    
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    
    public Vector<Trainee> getItems() {
        return items;
    }

    public void setItems(Vector<Trainee> items) {
        this.items = items;
    }

    public String getTrainee() {
        return trainee;
    }

    public void setTrainee(String trainee) {
        this.trainee = trainee;
    }

    public List<Classs> getList() {
        return list;
    }

    public void setList(List<Classs> list) {
        this.list = list;
    }
    
    
    public AddAssignTrainee() {
    }
    
    public String execute() throws Exception {
        Map session=ActionContext.getContext().getSession();
        String course=(String) session.get("COURSE");
        
        ClassProcess cp=new ClassProcess();
        if(cp.addAssignTrainee1(trainee, course))
        {
        
       TraineeProcess tp=new TraineeProcess();
       item=tp.getDetailAssign(course);
       items=tp.getData();
            return "SUCCESS";
        }
        return "FALSE";
    }
    
}
