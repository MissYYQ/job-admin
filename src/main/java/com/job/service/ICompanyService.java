package com.job.service;

import com.job.pojo.Company;

import java.util.List;

public interface ICompanyService {

    List<Company> getAll();

    Company getOne(int id);

    void addPageviews(int id);

    List<Company> getHotCompany();

    List<Company> getSearchHotCompany(String key);

    Company searchByUserId(Integer userId);

    int insertCompany(Company c);

    int updateCompany(Company c);

    int getCount();
}
