package com.sakthi.project.dto;

import java.sql.Date;
import java.time.LocalDate;


public class PatientDto {
    private Long id;
    private String name;
    private Long mobile;
    private Long age;
    private Boolean status;
    private LocalDate lastVisited;


    public PatientDto(Long id, String name, Long mobile, Long age, Boolean status, LocalDate lastVisited) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.age = age;
        this.status = status;
        this.lastVisited = lastVisited;
    }

    public PatientDto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDate getLastVisited() {
        return lastVisited;
    }

    public void setLastVisited(LocalDate lastVisited) {
        this.lastVisited = lastVisited;
    }
}
