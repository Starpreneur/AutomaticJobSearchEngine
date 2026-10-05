package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums;

public enum EmploymentType {
    FULL_TIME(11, "full-time"),
    PART_TIME(12, "part-time"),
    CONTRACT(13, "contract"),
    INTERNSHIP(14, "internship"),
    TEMPORARY(15, "temporary"),
    UNKNOWN(16, "unknown");

    private final int id;
    private final String type;


    EmploymentType(int id, String type) {
        this.id = id;
        this.type = type;
    }
}
