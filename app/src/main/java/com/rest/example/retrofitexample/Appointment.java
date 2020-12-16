package com.rest.example.retrofitexample;

public class Appointment {

    private int id;
    private String time;
    private String name;
    private String number;

    public Appointment(int id, String time, String name, String number) {
        this.id = id;
        this.time = time;
        this.name = name;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
