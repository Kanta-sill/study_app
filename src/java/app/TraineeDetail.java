/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Trainee;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Vector;
import model.TraineeProcess;

/**
 *
 * @author Admin
 */
public class TraineeDetail extends ActionSupport {
    
    public TraineeDetail() {
    }
    private Vector<Trainee> item;
    private String id;

    public Vector<Trainee> getItem() {
        TraineeProcess tp=new TraineeProcess();
        item=tp.getDataAssign(id);
        return item;
    }

    public void setItem(Vector<Trainee> item) {
        this.item = item;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String execute() throws Exception {
        TraineeProcess tp=new TraineeProcess();
        item=tp.getDataAssign(id);
        return "SUCCESS";
    }
    
}
