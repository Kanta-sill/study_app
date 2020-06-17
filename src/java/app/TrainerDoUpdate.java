/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.opensymphony.xwork2.ActionSupport;
import model.TrainerProcess;

/**
 *
 * @author Admin
 */
public class TrainerDoUpdate extends ActionSupport {
    
    public TrainerDoUpdate() {
    }
    
    private String id;
    private String name;
    private String account;
    private String age;
    private String dot;
    private String exin;
    private String edu;
    private String placework;
    private String email;
    private String toeic;
    private String depart;
    private String location;
    private String exp;

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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDot() {
        return dot;
    }

    public void setDot(String dot) {
        this.dot = dot;
    }

    public String getExin() {
        return exin;
    }

    public void setExin(String exin) {
        this.exin = exin;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getPlacework() {
        return placework;
    }

    public void setPlacework(String placework) {
        this.placework = placework;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToeic() {
        return toeic;
    }

    public void setToeic(String toeic) {
        this.toeic = toeic;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
    
    
    public String execute() throws Exception {
        TrainerProcess tp=new TrainerProcess();
        if(tp.updateTrainer(id, name, account, age, dot, exin, edu, placework, email, toeic, depart, location, exp))
        {
            return "SUCCESS";
        }
        return "FAILED";
    }
    
}
