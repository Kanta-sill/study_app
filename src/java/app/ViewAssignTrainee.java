/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Course;
import Entity.Trainee;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import java.util.Vector;
import model.DataProcess;
import model.TraineeProcess;

/**
 *
 * @author Admin
 */
public class ViewAssignTrainee extends ActionSupport {
    
    public ViewAssignTrainee() {
    }
    private String id;
    
    
    private Vector<Trainee> items;
    private Vector<Trainee> item;

    public Vector<Trainee> getItem() {
        return item;
    }

    public void setItem(Vector<Trainee> item) {
        this.item = item;
    }
    

    public Vector<Trainee> getItems() {
        TraineeProcess tp=new TraineeProcess();
       items=tp.getData();
        return items;
    }

    public void setItems(Vector<Trainee> items) {
        this.items = items;
    }
    

    public String getId() {
        TraineeProcess tp=new TraineeProcess();
        item=tp.getDetailAssign(id);
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
    
    public String execute() throws Exception {
        
        Map session=ActionContext.getContext().getSession();
//        session.remove("COURSE");
//        session.put("COURSE", id);
        
        
        session.remove("COURSE");
        
        session.put("COURSE", id);
       
       TraineeProcess tp=new TraineeProcess();
       items=tp.getData();
       item=tp.getDetailAssign(id);
       return "SUCCESS";
    }
    
}
