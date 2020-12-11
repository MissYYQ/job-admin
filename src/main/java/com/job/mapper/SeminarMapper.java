package com.job.mapper;

import com.job.pojo.Seminar;
import java.util.List;

public interface SeminarMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Seminar record);

    Seminar selectByPrimaryKey(Integer id);

    List<Seminar> selectAll();

    int updateByPrimaryKey(Seminar record);

    List<Seminar> selectSearchSeminar(String key);

    List<Seminar> selectByCompanyId(Integer companyId);
}