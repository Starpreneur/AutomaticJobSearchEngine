package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "companies")
public class Company {

    private Long id;

    private String companyName;
    private String website;
    private String logourl;
    private String industry;
    private String location;

    public void setId(Long id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setLogourl(String logourl) {
        this.logourl = logourl;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
