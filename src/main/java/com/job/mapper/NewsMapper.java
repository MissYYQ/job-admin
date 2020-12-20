package com.job.mapper;

import com.job.pojo.News;
import com.job.pojo.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(News record);

    News selectByPrimaryKey(Integer id);

    List<News> selectAll();

    int updateByPrimaryKey(News record);

    int selectCountByStudentId(Integer studentId);

    int selectCountByCompanyId(Integer companyId);

    List<News> selectAllByStudentId(Integer studentId);

    List<News> selectAllByCompanyId(Integer companyId);

    News selectOne(@Param("studentId") Integer studentId, @Param("companyId") Integer companyId);

    int updateLast(News news);
}