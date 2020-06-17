/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import model.DataProcess;

/**
 *
 * @author DELL 3578
 */
public class DeleteAction extends ActionSupport {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public DeleteAction() {
    }
    
    public String execute() throws Exception {
        DataProcess dt=new DataProcess();
        String i=(id);
        if(dt.deleteCourse(i))
            return"SUCCESS";
        return"FALSE";
    }
    
}
