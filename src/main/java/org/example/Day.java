package org.example;

public class Day {
    private final String[] days = {"Monday","Tuesday","Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private int day_id;
    private int task_id;

    public Day() {
    }

    public Day(int day_id, int task_id) {
        this.day_id = day_id;
        this.task_id = task_id;
    }

    public String[] getDays() {
        return days;
    }

    public int getDay_id() {
        return day_id;
    }

    public void setDay_id(int day_id) {
        this.day_id = day_id;
    }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }
}
