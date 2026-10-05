package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.entity;

import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums.EmploymentType;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums.JobSource;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums.JobStatus;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums.RemoteType;
import jakarta.persistence.*;
import lombok.Getter;

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
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private String location;

    @Enumerated(EnumType.STRING)
    private RemoteType remoteType;

    @Enumerated(EnumType.STRING)
    private EmploymentType employmentType;

    private Integer experienceMin;

    private Integer experienceMax;

    private BigDecimal salaryMin;

    private BigDecimal salaryMax;

    private String salaryCurrency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @Enumerated(EnumType.STRING)
    private JobSource source;

    private String externalJobId;

    private String sourceUrl;

    @Enumerated(EnumType.STRING)
    private JobStatus status;

    private LocalDateTime postedAt;

    private LocalDateTime expiresAt;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRemoteType(RemoteType remoteType) {
        this.remoteType = remoteType;
    }

    public void setEmploymentType(EmploymentType employmentType) {
        this.employmentType = employmentType;
    }

    public void setExperienceMin(Integer experienceMin) {
        this.experienceMin = experienceMin;
    }

    public void setExperienceMax(Integer experienceMax) {
        this.experienceMax = experienceMax;
    }

    public void setSalaryMin(BigDecimal salaryMin) {
        this.salaryMin = salaryMin;
    }

    public void setSalaryMax(BigDecimal salaryMax) {
        this.salaryMax = salaryMax;
    }

    public void setSalaryCurrency(String salaryCurrency) {
        this.salaryCurrency = salaryCurrency;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setSource(JobSource source) {
        this.source = source;
    }

    public void setExternalJobId(String externalJobId) {
        this.externalJobId = externalJobId;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public void setPostedAt(LocalDateTime postedAt) {
        this.postedAt = postedAt;
    }

    public void setExpiresAt(LocalDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
