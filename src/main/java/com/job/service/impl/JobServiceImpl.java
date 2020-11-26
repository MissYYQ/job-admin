package com.job.service.impl;

import com.job.mapper.JobMapper;
import com.job.pojo.Job;
import com.job.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl  implements IJobService {

    @Autowired
    private JobMapper jobMapper;

    @Override
    public List<Job> getAll() {
        List<Job> jobList = jobMapper.selectAll();
        return jobList;
    }

    @Override
    public Job getOne(int id) {
        Job job = jobMapper.selectByPrimaryKey(id);
        return job;
    }
}
