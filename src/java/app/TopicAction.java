/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Course;
import Entity.Topic;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Vector;
import model.DataProcess;
import model.TopicProcess;

/**
 *
 * @author Admin
 */
public class TopicAction extends ActionSupport {
    
    private String id;
    private String name;
    private String des;
    
    private List<Topic> list;

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
    
    
    public TopicAction() {
    }
    
    public String execute() throws Exception {
        TopicProcess tp = new TopicProcess();
        if(tp.addTopic(id, name, des))
        {
            list=tp.getList();
            return "SUCCESS";
        }
        else
        {
              return"FALSE";  
        }
    }
    
    
    
}
