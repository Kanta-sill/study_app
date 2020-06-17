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
public class SearchTraineeAction extends ActionSupport {
    
    public SearchTraineeAction() {
    }
    private String name;
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
        items=tp.getDataSearch(name);
        return items;
    }

    public void setItems(Vector<Trainee> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
        

    
    public String execute() throws Exception {
        Map session=ActionContext.getContext().getSession();
        String course=(String) session.get("COURSE");
        
        TraineeProcess tp=new TraineeProcess();
        item=tp.getDetailAssign(course);
        items=tp.getDataSearch(name);
        return "SUCCESS";
    }
    
}
