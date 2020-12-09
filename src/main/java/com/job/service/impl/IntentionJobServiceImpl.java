package com.job.service.impl;

import com.job.mapper.IntentionJobMapper;
import com.job.pojo.IntentionJob;
import com.job.pojo.User;
import com.job.service.IIntentionJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntentionJobServiceImpl implements IIntentionJobService {

    @Autowired
    private IntentionJobMapper intentionJobMapper;

    @Override
    public IntentionJob searchByUserId(Integer userId) {
        IntentionJob intentionJob = intentionJobMapper.selectByUserId(userId);
        return intentionJob;
    }

    @Override
    public int insertIntention(IntentionJob intention) {
        int i = intentionJobMapper.insert(intention);
        return i;
    }

    @Override
    public int updateByUserId(IntentionJob intention) {
        int i = intentionJobMapper.updateByUserId(intention);
        return i;
    }

}
