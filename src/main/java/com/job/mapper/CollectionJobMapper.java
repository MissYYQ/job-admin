package com.job.mapper;

import com.job.pojo.CollectionJob;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollectionJobMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CollectionJob record);

    CollectionJob selectByPrimaryKey(Integer id);

    List<CollectionJob> selectAll();

    int updateByPrimaryKey(CollectionJob record);

    int isCollection(@Param("userId")Integer userId, @Param("jobId")Integer jobId);

    void delete(@Param("userId")Integer userId, @Param("jobId")Integer jobId);

    int selectjobCount(Integer userId);

}