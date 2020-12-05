package com.job.controller;

import com.job.pojo.Company;
import com.job.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private ICompanyService companyService;

    @ResponseBody
    @RequestMapping("/all")
    public List<Company> getAll(){
        List<Company> companyList = companyService.getAll();
        return companyList;
    }

    @ResponseBody
    @RequestMapping("/one")
    public Company getOne(int id){
        Company company = companyService.getOne(id);
        return company;
    }

    @ResponseBody
    @RequestMapping("/addPageviews")
    public void addPageviews(int id){
        companyService.addPageviews(id);
    }

    @ResponseBody
    @RequestMapping("/hotCompany")
    public List<Company> hotCompany(){
        List<Company> companyList = companyService.getHotCompany();
        return companyList;
    }

    @ResponseBody
    @RequestMapping("/hotCompanySearch")
    public List<Company> searchHotCompany(String key){
        List<Company> companyList = companyService.getSearchHotCompany(key);
        return companyList;
    }


}
