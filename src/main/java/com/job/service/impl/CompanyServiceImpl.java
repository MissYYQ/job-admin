package com.job.service.impl;

import com.job.mapper.CompanyMapper;
import com.job.pojo.Company;
import com.job.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public List<Company> getAll() {
        List<Company> companyList = companyMapper.selectAll();
        return companyList;
    }

    @Override
    public Company getOne(int id) {
        Company company = companyMapper.selectByPrimaryKey(id);
        return company;
    }

    @Override
    public void addPageviews(int id) {
        companyMapper.addPageviews(id);
    }

    @Override
    public List<Company> getHotCompany() {
        List<Company> companyList = companyMapper.selectHotCompany();
        return companyList;
    }
}
