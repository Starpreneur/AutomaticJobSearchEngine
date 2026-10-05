package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums;

public enum JobStatus {

    ACTIVE(1, "active"),
    EXPIRED(2, "expired"),
    CLOSED(3, "closed");

    private final int id;
    private final String name;

    JobStatus(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
