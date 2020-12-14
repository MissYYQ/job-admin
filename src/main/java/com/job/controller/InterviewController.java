package com.job.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.job.pojo.Interview;
import com.job.service.IInterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/interview")
public class InterviewController {

    @Autowired
    private IInterviewService interviewService;

    @ResponseBody
    @RequestMapping("/interviewCount")
    public int interviewCount(Integer userId){
        int count = interviewService.countByUserId(userId);
        return count;
    }

    @ResponseBody
    @RequestMapping("allByUserId")
    public List<Interview> selectByUserId (Integer userId){
        List<Interview> interviewList = interviewService.selectByUserId(userId);
        return interviewList;
    }

    @ResponseBody
    @RequestMapping("/countByCompanyId")
    public int countByCompanyId(Integer companyId){
        int count = interviewService.selectCountByCompanyId(companyId);
        return count;
    }

    @ResponseBody
    @RequestMapping("/add")
    public int add(Integer userId,Integer jobId,String addInterview){
        JSONObject jsonObject = JSON.parseObject(addInterview);
        Interview interview = new Interview();
        interview.setUserId(userId);
        interview.setJobId(jobId);
        interview.setDate(jsonObject.getString("date"));
        interview.setTime(jsonObject.getString("time"));
        interview.setRegion(jsonObject.getString("region"));
        interview.setDetailedaddress(jsonObject.getString("detailedaddress"));
        int i = interviewService.add(interview);
        return i;
    }


    @ResponseBody
    @RequestMapping("allByCompanyId")
    public List<Interview> selectByCompanyId (Integer companyId){
        List<Interview> interviewList = interviewService.selectByCompanyId(companyId);
        return interviewList;
    }

}
