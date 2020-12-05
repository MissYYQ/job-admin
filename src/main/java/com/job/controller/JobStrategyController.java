package com.job.controller;

import com.job.pojo.JobStrategy;
import com.job.service.IJobStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/jobstrategy")
public class JobStrategyController {

    @Autowired
    private IJobStrategyService jobStrategyService;

    @RequestMapping("/all")
    @ResponseBody
    public List<JobStrategy> getAll(){
        List<JobStrategy> jobStrategies = jobStrategyService.getAll();
        return jobStrategies;
    }
}
