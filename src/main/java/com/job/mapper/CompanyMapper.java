package com.job.mapper;

import com.job.pojo.Company;
import java.util.List;

public interface CompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Company record);

    Company selectByPrimaryKey(Integer id);

    List<Company> selectAll();

    int updateByPrimaryKey(Company record);

    void addPageviews(int id);

    List<Company> selectHotCompany();

}