package com.geekster.job_search_portal.jobrepo;

import com.geekster.job_search_portal.jobModel.JobModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<JobModel,Long> {


    List<JobModel> findAll();
}
