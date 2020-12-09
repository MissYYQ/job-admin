package com.job.mapper;

import com.job.pojo.Interview;
import java.util.List;

public interface InterviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Interview record);

    Interview selectByPrimaryKey(Integer id);

    List<Interview> selectAll();

    int updateByPrimaryKey(Interview record);

    List<Interview> selectByUserId(Integer userId);

    int selectCountByUserId(Integer userId);
}