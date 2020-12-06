package com.job.service.impl;

import com.job.mapper.CollectionJobMapper;
import com.job.pojo.CollectionJob;
import com.job.service.ICollectionJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionJobServiceImpl implements ICollectionJobService {

    @Autowired
    private CollectionJobMapper collectionJobMapper;


    @Override
    public boolean isCollection(Integer userId, Integer jobId) {
        int collection = collectionJobMapper.isCollection(userId, jobId);
        if (collection == 0){
            return false;
        }
        return true;
    }

    @Override
    public void collectJob(Integer userId, Integer jobId) {
        CollectionJob collectionJob = new CollectionJob();
        collectionJob.setUserId(userId);
        collectionJob.setJobId(jobId);
        collectionJobMapper.insert(collectionJob);
    }

    @Override
    public void uncollectJob(Integer userId, Integer jobId) {
        collectionJobMapper.delete(userId, jobId);
    }
}
