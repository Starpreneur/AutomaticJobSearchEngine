package com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.repository;

import com.Aethermind.AutomaticJobSearchEngine.automaticjobsearch.job.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {


}
