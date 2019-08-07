package com.example.ciphermaster;

public class Information {
    private String title;
    private String shortdesc;

    public Information(String title, String shortdesc) {
        this.title = title;
        this.shortdesc = shortdesc;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }
}
