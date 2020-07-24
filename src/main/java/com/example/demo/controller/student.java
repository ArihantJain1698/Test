package com.example.demo.controller;

public class student {
    private String name;
    private int roll;
    private int sec;
    public student(String name, int roll, int sec) {
        this.name = name;
        this.roll = roll;
        this.sec = sec;
    }
    public String getName() {
        return name;
    }
    public int getRoll() {
        return roll;
    }
    public int getSec() {
        return sec;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void setSec(int sec) {
        this.sec = sec;
    }
}
