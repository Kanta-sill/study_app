/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Topic;
import com.opensymphony.xwork2.ActionSupport;
import model.TopicProcess;

/**
 *
 * @author Admin
 */
public class UpdateTopic extends ActionSupport {
    
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
    
    public UpdateTopic() {
    }
    
    public String execute() throws Exception {
        TopicProcess tp=new TopicProcess();
        Topic t=tp.getById(id);
        setId(t.getId());
        setName(t.getName());
        setDes(t.getDes());
        return "SUCCESS";
    }
    
}
