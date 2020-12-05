package com.job.service.impl;

import com.job.mapper.JobStrategyMapper;
import com.job.pojo.JobStrategy;
import com.job.service.IJobStrategyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobStrategyServiceImpl implements IJobStrategyService {

    @Autowired
    private JobStrategyMapper jobStrategyMapper;

    @Override
    public List<JobStrategy> getAll() {
        List<JobStrategy> jobStrategies = jobStrategyMapper.selectAll();
        return jobStrategies;
    }
}
