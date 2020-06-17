/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import Entity.Account;
import java.util.ArrayList;
import model.DataProcess;

/**
 *
 * @author ADMIN
 */
public class ViewAccountAction extends ActionSupport {
    
    private ArrayList<Account> item;

    public ArrayList<Account> getItems() {
        DataProcess dt=new DataProcess();
        item=dt.getAccountData();
        return item;
    }

    public void setItems(ArrayList<Account> items) {
        this.item = item;
    }
    
    
    public ViewAccountAction() {
    }
    
    public String execute() throws Exception {
        DataProcess dt=new DataProcess();
        item=dt.getAccountData();
        return"SUCCESS";
    }
    
}
