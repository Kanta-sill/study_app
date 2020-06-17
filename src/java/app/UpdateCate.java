/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Category;
import com.opensymphony.xwork2.ActionSupport;
import model.CateProcess;

/**
 *
 * @author Admin
 */
public class UpdateCate extends ActionSupport {
    private String id;
    private String name;
    private String des;
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    
    
    public UpdateCate() {
    }
    
    public String execute() throws Exception {
        CateProcess cp=new CateProcess();
        Category t=cp.getById(id);
        
        setId(t.getId());
        
        setName(t.getName());
        setDes(t.getDes());
        return "SUCCESS";
    }
    
}
