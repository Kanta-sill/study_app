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

import model.TraineeProcess;

/**
 *
 * @author Admin
 */
public class ShowTrainee extends ActionSupport {
    
    public ShowTrainee() {
    }
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    private Vector<Trainee> item;

    public Vector<Trainee> getItem() {
        TraineeProcess tp=new TraineeProcess();
        item=tp.getDetailAssign(id);
        return item;
    }

    public void setItem(Vector<Trainee> item) {
        this.item = item;
    }
    
    
    public String execute() throws Exception {
        Map session=ActionContext.getContext().getSession();
        session.remove("COURSE");
        
        session.put("COURSE", id);
        
        TraineeProcess tp=new TraineeProcess();
        item=tp.getDetailAssign(id);
        return "SUCCESS";
    }
    
}
