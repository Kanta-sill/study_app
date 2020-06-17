/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import model.TopicProcess;

/**
 *
 * @author Admin
 */
public class DoUpdateTopic extends ActionSupport {
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
    
    
    public DoUpdateTopic() {
    }
    
    public String execute() throws Exception {
        TopicProcess tp=new TopicProcess();
        if(tp.updateTopic(id, name, des))
        {
            return "SUCCESS";
        }
        return "FAILED";
    }
    
}
