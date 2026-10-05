package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums;

public enum JobLocationType {
    HYBRID(100, "hybrid"),
    ON_SITE(200, "onSite"),
    Remote(300, "remote"),
    UNKNOWN(400, "unknown");

    private final int id;
    private final String type;

    JobLocationType(int id, String type) {
        this.id = id;
        this.type = type;
    }
}
