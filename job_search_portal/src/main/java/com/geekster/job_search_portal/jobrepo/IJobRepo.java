package com.geekster.job_search_portal.jobrepo;

import com.geekster.job_search_portal.jobModel.JobModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<JobModel,Long> {


    List<JobModel> findAll();

//    @Modifying
//    //@Transactional
//    @Query("UPDATE YourEntity e SET e.someField = :companyName WHERE e.id = :id")
//    void updateCompanyNameByTypes(Long id, String companyName);
@Modifying
@Transactional
@Query("UPDATE JobModel e SET e.someField = :companyName WHERE e.id = :id")
void updateCompanyNameByTypes(@Param("id") Long id, @Param("companyName") String companyName);

    @Modifying
    @Transactional
    @Query("DELETE FROM JobModel e WHERE e.id = :id")
    void DeleteById(Long id);
}

