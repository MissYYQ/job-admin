package com.job.mapper;

import com.job.pojo.IntentionJob;
import java.util.List;

public interface IntentionJobMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(IntentionJob record);

    IntentionJob selectByPrimaryKey(Integer id);

    List<IntentionJob> selectAll();

    int updateByPrimaryKey(IntentionJob record);

    IntentionJob selectByUserId(Integer userId);

    int updateByUserId(IntentionJob intention);
}