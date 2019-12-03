package com.restful.services;

import org.springframework.data.domain.Page;

import com.restful.Domain.Job;
import com.restful.beans.JobSearchBean;

public interface JobService {

	public Job save(Job job);

	public Job update(Job job);

	public void delete(Long id);

	public Page<Job> findAll(JobSearchBean jobSearchBean);
	
	public Job findById(Long id);

}
