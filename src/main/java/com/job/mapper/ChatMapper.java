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

    int selectCountByStudentId(Integer studentId);

    int selectCountByCompanyId(Integer companyId);

    List<Chat> selectAllByStudentId(Integer studentId);

    List<Chat> selectAllByCompanyId(Integer companyId);

    List<Chat> selectOne(@Param("companyId") Integer companyId, @Param("studentId") Integer studentId);
}