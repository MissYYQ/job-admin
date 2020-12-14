package com.job.service;

public interface ICollectionUserService {
    int userCount(Integer companyId);

    int searchOne(Integer userId, Integer companyId);

    int collectUser(Integer userId, Integer companyId);

    int uncollectUser(Integer userId, Integer companyId);
}
