/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Course;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Vector;
import model.DataProcess;

/**
 *
 * @author Admin
 */
public class SearchAction extends ActionSupport {
    
    public SearchAction() {
    }
    private String name;
    private Vector<Course> items;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Course> getItems() {
        DataProcess dt=new DataProcess();
        items=dt.getByName(name);
        return items;
    }

    public void setItems(Vector<Course> items) {
        this.items = items;
    }
    
    
    public String execute() throws Exception {
        DataProcess dt=new DataProcess();
        
        items=dt.getByName(name);
        
        return "SUCCESS";
    }
    
    
    
}
