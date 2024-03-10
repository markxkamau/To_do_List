package org.example;

import java.util.Date;

public class Task {
    private int task_id = 0;
    private String task_name = "";
    private Date task_deadline = new Date();
    private boolean task_status = false;

    public Task(int id, String name, Date deadline, boolean status){
        task_id = id;
        task_name = name;
        task_status = status;
        task_deadline = deadline;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTask_name() {
        return task_name;
    }

    public void setTask_name(String task_name) {
        this.task_name = task_name;
    }

    public Date getTask_deadline() {
        return task_deadline;
    }

    public void setTask_deadline(Date task_deadline) {
        this.task_deadline = task_deadline;
    }

    public boolean isTask_status() {
        return task_status;
    }

    public void setTask_status(boolean task_status) {
        this.task_status = task_status;
    }
}
