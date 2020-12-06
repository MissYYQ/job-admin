package com.job.controller;

import com.job.service.ICollectionJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/collection")
public class CollectionJobController {

    @Autowired
    private ICollectionJobService collectionJobService;

    @ResponseBody
    @RequestMapping("/jobIsCollection")
    public boolean isCollection(Integer userId,Integer jobId){
        boolean collection = collectionJobService.isCollection(userId, jobId);
        return collection;
    }

    @ResponseBody
    @RequestMapping("/collectJob")
    public void collectJob(Integer userId,Integer jobId){
        collectionJobService.collectJob(userId,jobId);
    }

    @ResponseBody
    @RequestMapping("/uncollectJob")
    public void uncollectJob(Integer userId,Integer jobId){
        collectionJobService.uncollectJob(userId,jobId);
    }
}
