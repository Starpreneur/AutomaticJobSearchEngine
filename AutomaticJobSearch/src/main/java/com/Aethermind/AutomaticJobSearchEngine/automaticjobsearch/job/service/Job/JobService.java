package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.service.Job;

import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.dto.JobDTO;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.entity.Job;
import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.enums.JobSource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface JobService {

    public void createJob(JobDTO jobDTO);
    public JobDTO searchJob(Long jobId);
    public List<JobDTO> getAllJobs();
    public List<Job> searchBySource(JobSource source);

}
