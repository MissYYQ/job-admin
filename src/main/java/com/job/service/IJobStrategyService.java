package com.job.service;

import com.job.pojo.JobStrategy;

import java.util.List;

public interface IJobStrategyService {
    List<JobStrategy> getAll();

    int getCount();
}
