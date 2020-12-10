package com.job.service;

import com.job.pojo.Job;

import java.util.List;

public interface IJobService {

    List<Job> getAll();

    Job getOne(int id);

    List<Job> getJobByCompanyId(int id);

    void addPageviews(int id);

    List<Job> getHotJob();

    List<Job> getSearchJob(String key);

    List<Job> getSearchHotJob(String key);

    List<Job> getCollectJob(Integer userId);

    List<Job> getDeliveryJob(Integer userId);

    int getCountByCompanyId(Integer companyId);
}
