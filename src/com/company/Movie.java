package com.company;

public class Movie {
    private String year;
    private String length;
    private String title;
    private String subject;
    private String popularity;
    private String award;

    public Movie(String year, String length, String title, String subject, String popularity, String award) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.award = award;
    }

    public Movie(){

    }

    public String getTitle() {
        return title;
    }

    public String getPopularity() {
        return popularity;
    }

    public String getYear() {
        return year;
    }

    public String getLength() {
        return length;
    }

    public String getSubject() {
        return subject;
    }

    public String getAward() {
        return award;
    }

    @Override
    public String toString() {
        return year + " " + length + " " + title + " " + subject + " " + popularity + " " + award;
    }
}
