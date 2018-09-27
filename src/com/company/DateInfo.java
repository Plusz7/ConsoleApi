package com.company;

public class DateInfo {

    private String date;
    private Boolean presence;

    public DateInfo() {
    }

    public DateInfo(String date, Boolean presence) {
        this.date = date;
        this.presence = presence;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Boolean getPresence() {
        return presence;
    }

    public void setPresence(Boolean presence) {
        this.presence = presence;
    }

    @Override
    public String toString() {
        return "[" + date + "; " + presence + "]";
    }
}
