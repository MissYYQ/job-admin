package com.job.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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

    @ResponseBody
    @RequestMapping("/oneByUserId")
    public Company getOneByUserId(Integer userId){
        Company company = companyService.searchByUserId(userId);
        return company;
    }

    @ResponseBody
    @RequestMapping("/edit")
    public int edit(Integer userId,String company){

        JSONObject jsonObject = JSON.parseObject(company);
        Company c = new Company();

        c.setUserId(userId);
        c.setName(jsonObject.getString("name"));
        c.setEmail(jsonObject.getString("email"));
        c.setLogourl(jsonObject.getString("logourl"));
        c.setSize(jsonObject.getString("size"));
        c.setFinancingstage(jsonObject.getString("financingstage"));
        c.setRegion(jsonObject.getString("region"));
        c.setDetailedaddress(jsonObject.getString("detailedaddress"));
        c.setIntroduction(jsonObject.getString("introduction"));
        c.setWorktime(jsonObject.getString("worktime"));
        c.setWelfare(jsonObject.getString("welfare"));
        c.setIndustry(jsonObject.getString("industry"));

        if (companyService.searchByUserId(userId) == null){
            //插入
            return companyService.insertCompany(c);
        }else {
            //更新
            return companyService.updateCompany(c);
        }

    }


}
