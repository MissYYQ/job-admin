package com.job.service;

public interface ICollectionJobService {

    boolean isCollection(Integer userId, Integer jobId);

    void collectJob(Integer userId, Integer jobId);

    void uncollectJob(Integer userId, Integer jobId);
}
