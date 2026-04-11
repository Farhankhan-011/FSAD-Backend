package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int enrollment;
    private String status;

    public Course() {}

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getEnrollment() { return enrollment; }
    public void setEnrollment(int enrollment) { this.enrollment = enrollment; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}