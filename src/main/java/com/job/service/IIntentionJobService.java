package com.job.service;

import com.job.pojo.IntentionJob;

public interface IIntentionJobService {

    IntentionJob searchByUserId(Integer userId);

    int insertIntention(IntentionJob intention);

    int updateByUserId(IntentionJob intention);
}
