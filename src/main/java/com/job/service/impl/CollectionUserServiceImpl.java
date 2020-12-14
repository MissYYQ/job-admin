package com.job.service.impl;

import com.job.mapper.CollectionUserMapper;
import com.job.service.ICollectionUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollectionUserServiceImpl implements ICollectionUserService {

    @Autowired
    private CollectionUserMapper collectionUserMapper;

    @Override
    public int userCount(Integer companyId) {
        int count = collectionUserMapper.selectCountByCompanyId(companyId);
        return count;
    }

    @Override
    public int searchOne(Integer userId, Integer companyId) {
        int i = collectionUserMapper.selectOne(userId, companyId);
        return i;
    }

    @Override
    public int collectUser(Integer userId, Integer companyId) {
        int i = collectionUserMapper.insertCollectUser(userId, companyId);
        return i;
    }

    @Override
    public int uncollectUser(Integer userId, Integer companyId) {
        int i = collectionUserMapper.deleteUncollectUser(userId, companyId);
        return i;
    }
}
