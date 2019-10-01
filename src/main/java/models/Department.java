package models;

import java.util.List;

public class Department {
    private String description;
    private int number_of_workers;
    private int id;
    private  int department_id;

    public Department(String description, int number_of_workers, int id, int department_id) {
        this.description = description;
        this.number_of_workers = number_of_workers;
        this.id = id;
        this.department_id = department_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public String getDescription() {
        return description;
    }
    public int getNumber_of_workers() {
        return number_of_workers;
    }
    public int getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNumber_of_workers(int number_of_workers) {
        this.number_of_workers = number_of_workers;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

}
