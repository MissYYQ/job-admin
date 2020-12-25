package com.job.controller;

import com.job.pojo.Admin;
import com.job.service.*;
import com.job.util.BaseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IAdminService adminService;

    @Autowired
    private IStudentService studentService;

    @Autowired
    private ICompanyService companyService;

    @Autowired
    private IJobService jobService;

    @Autowired
    private IJobStrategyService jobStrategyService;

    @CrossOrigin
    @RequestMapping("/login")
    @ResponseBody
    public BaseData login(String username, String password){
        BaseData baseData = new BaseData();
        Admin admin = adminService.login(username, password);
        try {
            if (admin == null){
                baseData.setSta(1);
                baseData.setObj(admin);
                baseData.setMsg("用户名或密码错误");
            }else {
                baseData.setSta(1);
                baseData.setObj(admin);
                baseData.setMsg("登录成功");
            }
        } catch (Exception e) {
            baseData.setSta(0);
            baseData.setMsg("登录失败");
        }
        return baseData;
    }

    @CrossOrigin
    @RequestMapping("/studentCount")
    @ResponseBody
    public int getStudentCount(){
        int count = studentService.getCount();
        return count;
    }

    @CrossOrigin
    @RequestMapping("/companyCount")
    @ResponseBody
    public int getCompanyCount(){
        int count = companyService.getCount();
        return count;
    }

    @CrossOrigin
    @RequestMapping("/jobCount")
    @ResponseBody
    public int getJobCount(){
        int count = jobService.getCount();
        return count;
    }

    @CrossOrigin
    @RequestMapping("/jobstrategyCount")
    @ResponseBody
    public int getJobstrategyCountCount(){
        int count = jobStrategyService.getCount();
        return count;
    }
}
