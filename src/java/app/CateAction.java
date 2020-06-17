/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Category;
import Entity.Topic;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import model.CateProcess;

/**
 *
 * @author Admin
 */
public class CateAction extends ActionSupport {
    
    
    private String id;
    private String name;
    private String des;
    
    
    private List<Category> list;
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

    
    
    public CateAction() {
    }
    
    public String execute() throws Exception {
        CateProcess cp= new CateProcess();
        if(cp.addCate(id, name, des)){
            list=cp.getList();
            return "SUCCESS";
        }
        return "FALSE";
    }
    
}
