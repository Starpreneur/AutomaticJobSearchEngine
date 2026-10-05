package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.controller;

import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.dto.JobDTO;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.service.Job.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/job")
public class JobController {

    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/createJob")
    public void createJob(JobDTO jobDTO) {
        jobService.createJob(jobDTO);
    }

    @GetMapping("/getJob/{jobId}")
    public JobDTO getJobById(@PathVariable Long jobId) {
        return jobService.searchJob(jobId);
    }

    @GetMapping("/getAllJobs")
    public List<JobDTO> getAllJobs() {
        return jobService.getAllJobs();
    }
}
