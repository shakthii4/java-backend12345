package com.ani.doker.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@NoArgsConstructor
@Data
public class App {
    private long id;
    private int version;
    private String name;
    private LocalDate publishedDate;
    private boolean isFree;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public App(long id, int version, String name, LocalDate publishedDate, boolean isFree) {
        this.id = id;
        this.version = version;
        this.name = name;
        this.publishedDate = publishedDate;
        this.isFree = isFree;

    }
}

  
