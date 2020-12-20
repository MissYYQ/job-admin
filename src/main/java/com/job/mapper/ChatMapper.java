package com.job.mapper;

import com.job.pojo.Chat;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Chat record);

    Chat selectByPrimaryKey(Integer id);

    List<Chat> selectAll();

    int updateByPrimaryKey(Chat record);

    List<Chat> selectOne(@Param("companyId") Integer companyId, @Param("studentId") Integer studentId);
}