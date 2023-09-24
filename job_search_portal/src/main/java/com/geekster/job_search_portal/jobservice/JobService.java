package com.geekster.job_search_portal.jobservice;

import com.geekster.job_search_portal.jobModel.JobModel;
import com.geekster.job_search_portal.jobrepo.IJobRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class JobService {
    @Autowired
    IJobRepo iJobRepo;

    public String addAllUser(List<JobModel> newJob) {
        for(JobModel vl:newJob){
            vl.setAppliedDate(LocalDate.now());


        }
        iJobRepo.saveAll(newJob);

        return " Job Added";
    }

    public List<JobModel> getAllJobModel() {
        return iJobRepo.findAll();
    }


    public String update(Long id, String companyName) {
        try {
            JobModel presentId = iJobRepo.findById(id).orElse(null);
            if (presentId != null) {
                presentId.setCompanyName(companyName);
                iJobRepo.save(presentId);
                return "CompanyName updated!!";
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return "User Id not found!";
    }

    public String DeleteId(Long id) {
        iJobRepo.deleteById(id);
        return "Delete Id successfully";
    }
}
