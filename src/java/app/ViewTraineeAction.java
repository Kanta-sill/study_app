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
public class ViewTraineeAction extends ActionSupport {
    private Vector<Trainee> items;
    
    public ViewTraineeAction() {
    }

    public Vector<Trainee> getItems() {
        TraineeProcess tp= new TraineeProcess();
        items=tp.getData();
        return items;
    }

    public void setItems(Vector<Trainee> items) {
        this.items = items;
    }
    
    public String execute() throws Exception {
        TraineeProcess tp= new TraineeProcess();
        items=tp.getData();
        return "SUCCESS";
    }
    
    
}
