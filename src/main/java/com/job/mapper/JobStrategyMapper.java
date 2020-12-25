package com.job.mapper;

import com.job.pojo.JobStrategy;
import java.util.List;

public interface JobStrategyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobStrategy record);

    JobStrategy selectByPrimaryKey(Integer id);

    List<JobStrategy> selectAll();

    int updateByPrimaryKey(JobStrategy record);

    int selectCount();

}