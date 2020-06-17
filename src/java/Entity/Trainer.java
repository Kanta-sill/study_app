/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Admin
 */
public class Trainer {
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

    public Trainer() {
    }

    public Trainer(String id, String name, String account, String age, String dot, String exin, String edu, String placework, String email, String toeic, String depart, String location, String exp) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.age = age;
        this.dot = dot;
        this.exin = exin;
        this.edu = edu;
        this.placework = placework;
        this.email = email;
        this.toeic = toeic;
        this.depart = depart;
        this.location = location;
        this.exp = exp;
    }

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
    
}
