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
public class ViewClass extends ActionSupport {
    
    public ViewClass() {
    }
    
    private Vector<Trainee> item;

    public Vector<Trainee> getItem() {
        return item;
    }

    public void setItem(Vector<Trainee> item) {
        this.item = item;
    }
    
    
    
    public String execute() throws Exception {
        TraineeProcess tp=new TraineeProcess();
        item=tp.ViewClass();
        return "SUCCESS";
    }
    
}
