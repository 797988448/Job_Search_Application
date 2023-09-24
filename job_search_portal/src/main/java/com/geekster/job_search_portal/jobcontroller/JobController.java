package com.geekster.job_search_portal.jobcontroller;

import com.geekster.job_search_portal.jobModel.JobModel;
import com.geekster.job_search_portal.jobservice.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;
@PostMapping("posts")
    public String addAllUser(@RequestBody @Valid List<JobModel> newJob){
        return jobService.addAllUser(newJob);
    }
    //custom finder
    @GetMapping("get")
    public List<JobModel> getAllJobModel(){
    return jobService.getAllJobModel();
    }

    @PutMapping("companyName/Id/{id}")
    public String update(@PathVariable Long id ,@RequestParam String companyName){
        return jobService.update(id,companyName);

    }
    @DeleteMapping("Delete/Id/{id}")
    public String DeleteId(@PathVariable Long id){
    return jobService.DeleteId(id);
    }

    @PutMapping("updateCompanyName/Id/{id}")
    public String updateCompanyNameByTypes(@PathVariable Long id ,@RequestParam String companyName){
        return jobService.updateCompanyNameByTypes(id,companyName);

    }
    @DeleteMapping("DeleteById/Id/{id}")
    public String DeleteById(@PathVariable Long id){
        return jobService.DeleteById(id);
    }


}
