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
public class DeleteTopic extends ActionSupport {
    
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public DeleteTopic() {
    }
    
    public String execute() throws Exception {
        TopicProcess tp=new TopicProcess();
        String i=id;
        if(tp.deleteTopic(i)){
            return"SUCCESS";
        }
        else{
           return"FALSE"; 
        }
        
    }
    
}
