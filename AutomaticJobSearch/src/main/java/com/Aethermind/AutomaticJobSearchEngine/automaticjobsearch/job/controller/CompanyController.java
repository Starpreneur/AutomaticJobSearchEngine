package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.controller;

import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.dto.CompanyDTO;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.service.company.CompanyService;
import lombok.Lombok;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/company")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/createCompany")
    public void createCompany(@RequestBody CompanyDTO companyDTO) {
        companyService.createCompany(companyDTO);
    }

    @GetMapping("/getCompany/{companyId}")
    public CompanyDTO getCompany(@PathVariable Long companyId) {
        return companyService.getCompany(companyId);
    }

    @GetMapping("/getAllCompanies")
    public List<CompanyDTO> getAllCompanies() {
        return companyService.getAllCompanies();
    }
}
