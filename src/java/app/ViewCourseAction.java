/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Account;
import Entity.Course;
import Entity.Topic;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import model.DataProcess;

/**
 *
 * @author DELL 3578
 */
public class ViewCourseAction extends ActionSupport {
    
    private Vector<Course> items;
    
    public ViewCourseAction(){
        
    }

    public Vector<Course> getItems() {
        DataProcess dt=new DataProcess();
        
        items=dt.getDataView();
        return items;
    }

    public void setItems(Vector<Course> items) {
        this.items = items;
    }
    
    
    
    public String execute() throws Exception {
        Map session=ActionContext.getContext().getSession();
        String username=(String) session.get("USERNAME");
        
        if(username !=null){
            DataProcess dt=new DataProcess();
        
            items=dt.getDataView();
       
        
        return "SUCCESS";
        }
        return "RETURN";
    }
    
}
