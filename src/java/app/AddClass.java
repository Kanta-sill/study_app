/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Entity.Classs;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import model.ClassProcess;

/**
 *
 * @author Admin
 */
public class AddClass extends ActionSupport {
    
    private String course;
    private String trainee;
    private List<Classs> list;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTrainee() {
        return trainee;
    }

    public void setTrainee(String trainee) {
        this.trainee = trainee;
    }

    public List<Classs> getList() {
        return list;
    }

    public void setList(List<Classs> list) {
        this.list = list;
    }
    
    
    public AddClass() {
    }
    
    public String execute() throws Exception {
        ClassProcess cp=new ClassProcess();
        if(cp.addClass(course, trainee))
        {
            list=cp.getList();
            return "SUCCESS";
        }
        return "FALSE";
    }
    
}
