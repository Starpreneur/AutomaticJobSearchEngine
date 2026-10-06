package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.service.company;

import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.dto.CompanyDTO;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.entity.Company;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompanyService {

    public void createCompany(CompanyDTO company);
    public CompanyDTO getCompany(Long companyId);
    public List<CompanyDTO> getAllCompanies();

}
