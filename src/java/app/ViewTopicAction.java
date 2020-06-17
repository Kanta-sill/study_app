/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Topic;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Vector;
import model.TopicProcess;

/**
 *
 * @author Admin
 */
public class ViewTopicAction extends ActionSupport {
    private Vector<Topic> items;
    
    public ViewTopicAction(){
        
    }

    public Vector<Topic> getItems() {
        TopicProcess tp=new TopicProcess();
        
        items=tp.getData();
        return items;
    }

    public void setItems(Vector<Topic> items) {
        this.items = items;
    }
        
    public String execute() throws Exception {
        TopicProcess tp=new TopicProcess();
        
        items=tp.getData();
        return "SUCCESS";
    }
    
}
