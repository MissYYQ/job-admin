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

    @Override
    public List<Job> getJobByCompanyId(int id) {
        List<Job> jobList = jobMapper.selectJobByCompanyId(id);
        return jobList;
    }

    @Override
    public void addPageviews(int id) {
        jobMapper.addPageviews(id);
    }

    @Override
    public List<Job> getHotJob() {
        List<Job> jobList = jobMapper.selectHotJob();
        return jobList;
    }

    @Override
    public List<Job> getSearchJob(String key) {
        List<Job> jobList = jobMapper.selectSearchJob(key);
        return jobList;
    }

    @Override
    public List<Job> getSearchHotJob(String key) {
        List<Job> jobList = jobMapper.selectSearchHotJob(key);
        return jobList;
    }

    @Override
    public List<Job> getCollectJob(Integer userId) {
        List<Job> jobList = jobMapper.selectCollectJob(userId);
        return jobList;
    }

    @Override
    public List<Job> getDeliveryJob(Integer userId) {
        List<Job> jobList = jobMapper.selectDeliveryJob(userId);
        return jobList;
    }

    @Override
    public int getCountByCompanyId(Integer companyId) {
        int count = jobMapper.selectCountByCompanyId(companyId);
        return count;
    }

    @Override
    public int update(Job j) {
        int i = jobMapper.updateByPrimaryKey(j);
        return i;
    }

    @Override
    public int add(Job j) {
        int i = jobMapper.insert(j);
        return i;
    }

    @Override
    public int delete(Integer id) {
        int i = jobMapper.deleteByPrimaryKey(id);
        return i;
    }

    @Override
    public List<Job> getByIntentionJob(String job, String city) {
        List<Job> jobList = jobMapper.selectByIntentionJob(job, city);
        return jobList;
    }

    @Override
    public List<Job> getNotIntention(String job, String city) {
        List<Job> jobList = jobMapper.selectNotIntention(job, city);
        return jobList;
    }

    @Override
    public List<Job> getByJob(String job, String city) {
        List<Job> jobList = jobMapper.selectJob(job,city);
        return jobList;
    }

    @Override
    public List<Job> getByCity(String job, String city) {
        List<Job> jobList = jobMapper.selectCity(job,city);
        return jobList;
    }

}
