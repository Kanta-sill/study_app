/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import model.CateProcess;

/**
 *
 * @author Admin
 */
public class DeleteCate extends ActionSupport {
    
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public DeleteCate() {
    }
    
    public String execute() throws Exception {
        CateProcess cp=new CateProcess();
        String i=id;
        if(cp.deleteCate(i)){
            return"SUCCESS";
        }
        else{
           return"FALSE"; 
        }
        
    }
}
