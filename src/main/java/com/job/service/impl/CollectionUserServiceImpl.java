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
}
