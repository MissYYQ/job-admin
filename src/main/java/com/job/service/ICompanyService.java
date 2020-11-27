package com.job.service;

import com.job.pojo.Company;

import java.util.List;

public interface ICompanyService {

    List<Company> getAll();

    Company getOne(int id);

    void addPageviews(int id);

    List<Company> getHotCompany();

}
