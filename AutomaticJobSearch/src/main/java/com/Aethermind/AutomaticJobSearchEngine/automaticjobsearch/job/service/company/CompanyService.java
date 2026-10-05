package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.service.company;

import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.entity.Company;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {

    public void createCompany(Company company);
    public Company getCompany(Long companyId);
    public List<Company> getAllCompanies();

}
