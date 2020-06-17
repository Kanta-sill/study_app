/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Trainee;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import java.util.Vector;
import model.ClassProcess;
import model.TraineeProcess;

/**
 *
 * @author Admin
 */
public class DeleteClass extends ActionSupport {
    
    public DeleteClass() {
    }
    private String course;
    private String trainee;
    private Vector<Trainee> items;
    private Vector<Trainee> item;

    public Vector<Trainee> getItems() {
        return items;
    }

    public void setItems(Vector<Trainee> items) {
        this.items = items;
    }

    public Vector<Trainee> getItem() {
        return item;
    }

    public void setItem(Vector<Trainee> item) {
        this.item = item;
    }
    

    public String getTrainee() {
        return trainee;
    }

    public void setTrainee(String trainee) {
        this.trainee = trainee;
    }
    

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    public String execute() throws Exception {
        Map session=ActionContext.getContext().getSession();
        String course=(String) session.get("COURSE");
        
        ClassProcess cp=new ClassProcess();
        
        if(cp.deleteClass(course,trainee)){
            TraineeProcess tp=new TraineeProcess();
       item=tp.getDetailAssign(course);
       items=tp.getData();
            return"SUCCESS";
        }
        else{
           return"FALSE"; 
        }
    }
    
}
