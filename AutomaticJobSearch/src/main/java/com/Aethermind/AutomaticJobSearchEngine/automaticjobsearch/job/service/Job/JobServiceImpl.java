package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.service.Job;

import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.dto.JobDTO;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.entity.Job;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums.JobSource;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;

    @Autowired
    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public void createJob(JobDTO jobDTO) {

    }

    @Override
    public JobDTO searchJob(Long jobId) {
        return null;
    }

    @Override
    public List<JobDTO> getAllJobs() {
        return List.of();
    }

    @Override
    public List<Job> searchBySource(JobSource source) {
        return List.of();
    }
}
