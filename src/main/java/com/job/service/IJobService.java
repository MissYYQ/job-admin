package com.job.service;

import com.job.pojo.Job;

import java.util.List;

public interface IJobService {
    List<Job> getAll();
    Job getOne(int id);
}
