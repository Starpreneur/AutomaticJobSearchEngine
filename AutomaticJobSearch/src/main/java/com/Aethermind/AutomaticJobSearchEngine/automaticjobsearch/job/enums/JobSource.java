package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums;

public enum JobSource {

    LINKEDIN(10, "linkedIn"),
    INDEED(20, "indeed"),
    NAUKRI(30, "naukri"),
    GLASSDOOR(40, "glassdoor");

    private final int id;
    private final String name;

    JobSource(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
