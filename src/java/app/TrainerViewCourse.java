/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Course;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import java.util.Vector;
import model.DataProcess;

/**
 *
 * @author Admin
 */
public class TrainerViewCourse extends ActionSupport {
    private Vector<Course> item;
    private String account;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    
    public Vector<Course> getItem() {
        Map session=ActionContext.getContext().getSession();
        account=(String) session.get("ACCOUNT");
        
        DataProcess dp=new DataProcess();
        item=dp.getDataTrainer(account);
        return item;
    }

    public void setItem(Vector<Course> item) {
        this.item = item;
    }
    
    public TrainerViewCourse() {
    }
    
    public String execute() throws Exception {
        Map session=ActionContext.getContext().getSession();
        account=(String) session.get("ACCOUNT");
        if(account !=null){
            DataProcess dp=new DataProcess();
        item=dp.getDataTrainer(account);
        return "SUCCESS";
        }
        return "RETURN";
    }
    
}
