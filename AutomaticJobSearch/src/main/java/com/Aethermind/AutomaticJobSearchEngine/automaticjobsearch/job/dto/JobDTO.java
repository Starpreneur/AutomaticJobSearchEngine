package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.dto;

import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums.EmploymentType;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums.JobLocationType;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums.JobSource;

import java.math.BigDecimal;

public class JobDTO {

    private String title;
    private String description;
    private String location;

    private JobLocationType jobLocationType;
    private EmploymentType employmentType;

    private Integer experienceMin;
    private Integer experienceMax;

    private BigDecimal salaryMin;
    private BigDecimal salaryMax;

    private String salaryCurrency;

    private Long companyId;

    private JobSource source;
    private String externalJobId;
    private String sourceUrl;
}
