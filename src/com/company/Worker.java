package com.company;

import java.util.List;

public class Worker {

    private String name;
    private Boolean presence;
    private String workerCode;
    private List<DateInfo> myList;

    public Worker() {
    }

    public Worker(String name, String workerCode) {
        this.name = name;
        this.workerCode = workerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPresence() {
        return presence;
    }

    public void setPresence(Boolean presence) {
        this.presence = presence;
    }

    public String getWorkerCode() {
        return workerCode;
    }

    public void setWorkerCode(String workerCode) {
        this.workerCode = workerCode;
    }

    public List<DateInfo> getMyList() {
        return myList;
    }

    public void setMyList(List<DateInfo> myList) {
        this.myList = myList;
    }

    @Override
    public String toString() {
        return "[" + name + "; " + workerCode + "]";
    }
}
