package com.job.mapper;

import com.job.pojo.CollectionUser;
import java.util.List;

public interface CollectionUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CollectionUser record);

    CollectionUser selectByPrimaryKey(Integer id);

    List<CollectionUser> selectAll();

    int updateByPrimaryKey(CollectionUser record);

    int selectCountByCompanyId(Integer companyId);
}