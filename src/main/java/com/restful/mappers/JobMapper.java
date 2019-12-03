package com.restful.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

import com.restful.DTO.JobDTO;
import com.restful.Domain.Job;

@Mapper(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL, componentModel = "spring")
public interface JobMapper {

	JobMapper INSTANCE = Mappers.getMapper( JobMapper.class ); 
	
	public JobDTO jobToJobDTO(Job job);

	public Job jobDTOToJob(JobDTO jobDTO);

}
