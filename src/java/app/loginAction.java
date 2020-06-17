/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Course;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import model.DataProcess;

/**
 *
 * @author DELL 3578
 */
public class loginAction extends ActionSupport {
    String user;
    String pass;
    String role;
    
    private String account;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    
    private Vector<Course> item;

    public Vector<Course> getItem() {
        DataProcess dt=new DataProcess();
        item=dt.getDataTrainer(account);
        return item;
    }

    public void setItem(Vector<Course> item) {
        this.item = item;
    }
    
    public loginAction() {
    }

    
    
    public String execute() throws Exception {
        DataProcess dt=new DataProcess();
//        boolean result=dt.checkLogin(user, pass);
        
        if(dt.checkLoginAdmin(user, pass))
        {
            Map session=ActionContext.getContext().getSession();
            session.put("USERNAME", user);
            return "SUCCESS";
        }
        if(dt.checkLoginTrainer(user, pass)){
            Map session=ActionContext.getContext().getSession();
            session.put("USERNAME", user);
            
            account=user+"-"+pass;
            session.put("ACCOUNT", account);
            
            item=dt.getDataTrainer(account);
            return "SUCCESSTRAINER";
        }
        return "FALSE";
    }

    public loginAction(String user, String pass, String role) {
        this.user = user;
        this.pass = pass;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUser() {
        
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
