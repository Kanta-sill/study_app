/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Category;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Vector;
import model.CateProcess;
import model.TopicProcess;

/**
 *
 * @author Admin
 */
public class ViewCateAction extends ActionSupport {
    
    private Vector<Category> items;
    
    public ViewCateAction(){
        
    }

    public Vector<Category> getItems() {
        CateProcess cp=new CateProcess();
        
        items=cp.getData();
        return items;
    }

    public void setItems(Vector<Category> items) {
        this.items = items;
    }
        
    public String execute() throws Exception {
        CateProcess cp=new CateProcess();
        
        items=cp.getData();
        return "SUCCESS";
    }
    
}
