package com.interview.excersize.AppointmentTracker;

import javax.persistence.*;

/**
 * Created by fenji on 3/7/2018.
 */
@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String appDate;

    @Column(nullable = false)
    String appTime;

    @Column(nullable = false)
    String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppDate() {
        return appDate;
    }

    public void setAppDate(String appDate) {
        this.appDate = appDate;
    }

    public String getAppTime() {
        return appTime;
    }

    public void setAppTime(String appTime) {
        this.appTime = appTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Appointment(){

    }

    public Appointment(String appDate, String appTime, String description) {
        this.appDate = appDate;
        this.appTime = appTime;
        this.description = description;
    }


}

