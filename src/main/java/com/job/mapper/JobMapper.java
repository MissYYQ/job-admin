package com.job.mapper;

import com.job.pojo.Job;
import java.util.List;

public interface JobMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Job record);

    Job selectByPrimaryKey(Integer id);

    List<Job> selectAll();

    int updateByPrimaryKey(Job record);

    List<Job> selectJobByCompanyId(int id);

    void addPageviews(int id);

    List<Job> selectHotJob();

    List<Job> selectSearchJob(String key);

    List<Job> selectSearchHotJob(String key);

    List<Job> selectCollectJob(Integer userId);
}