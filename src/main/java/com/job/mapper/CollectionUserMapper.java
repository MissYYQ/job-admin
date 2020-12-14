package com.job.mapper;

import com.job.pojo.CollectionUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollectionUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CollectionUser record);

    CollectionUser selectByPrimaryKey(Integer id);

    List<CollectionUser> selectAll();

    int updateByPrimaryKey(CollectionUser record);

    int selectCountByCompanyId(Integer companyId);

    int selectOne(@Param("userId") Integer userId, @Param("companyId") Integer companyId);

    int insertCollectUser(@Param("userId") Integer userId, @Param("companyId") Integer companyId);

    int deleteUncollectUser(@Param("userId") Integer userId, @Param("companyId") Integer companyId);
}