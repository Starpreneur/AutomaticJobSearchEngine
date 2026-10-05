package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.entity;

import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums.EmploymentType;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums.JobSource;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums.JobStatus;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums.JobLocationType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Table(
        name = "jobs",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "uk_job_source_external_id",
                        columnNames = {"source", "external_job_id"}
                )
        }
)
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String title;

    @Setter
    @Column(columnDefinition = "TEXT")
    private String description;

    @Setter
    private String location;

    @Setter
    @Enumerated(EnumType.STRING)
    private JobLocationType jobLocationType;

    @Setter
    @Enumerated(EnumType.STRING)
    private EmploymentType employmentType;

    @Setter
    private Integer experienceMin;

    @Setter
    private Integer experienceMax;

    @Setter
    private BigDecimal salaryMin;

    @Setter
    private BigDecimal salaryMax;

    @Setter
    private String salaryCurrency;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @Setter
    @Enumerated(EnumType.STRING)
    private JobSource source;

    @Setter
    private String externalJobId;

    @Setter
    private String sourceUrl;

    @Setter
    @Enumerated(EnumType.STRING)
    private JobStatus status;

    @Setter
    private LocalDateTime postedAt;

    @Setter
    private LocalDateTime expiresAt;

    @Setter
    private LocalDateTime createdAt;

    @Setter
    private LocalDateTime updatedAt;

}
