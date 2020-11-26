package com.job.controller;

import com.job.pojo.Job;
import com.job.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/job")
public class JobController {

    @Autowired
    private IJobService jobService;

    @ResponseBody
    @RequestMapping("/all")
    public List<Job> getAll(){
        List<Job> jobList = jobService.getAll();
        return jobList;
    }

    @ResponseBody
    @RequestMapping("/one")
    public Job getOne(int id){
        Job job = jobService.getOne(id);
        return job;
    }
}
