package models;

import org.sql2o.*;

public class User {
    private String employee_name;
    private String position;
    private String role;
    private int id;

    public User(String employee_name, String position, String role) {
        this.employee_name = employee_name;
        this.position = position;
        this.role = role;
        this.id = id;
    }
    public String getEmployee_name() {
        return employee_name;
    }
    public String getPosition() {
        return position;
    }
    public String getRole() {
        return role;
    }
    public int getId() {
        return id;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setId(int id) {
        this.id = id;
    }

}