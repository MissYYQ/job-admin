package com.job.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.job.pojo.ResumeFile;
import com.job.service.IResumeFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/resumefile")
public class ResumeFileController {

    @Autowired
    private IResumeFileService resumeFileService;

    @ResponseBody
    @RequestMapping("/one")
    public ResumeFile searchByUserId(Integer userId){
        ResumeFile resumeFile = resumeFileService.searchByUserId(userId);
        return resumeFile;
    }

    @ResponseBody
    @RequestMapping("/edit")
    public int edit(Integer userId,String resumeFile){

        JSONObject jsonObject = JSON.parseObject(resumeFile);
        ResumeFile rFile = new ResumeFile();

        rFile.setUserId(userId);
        rFile.setName(jsonObject.getString("name"));
        rFile.setPath(jsonObject.getString("path"));

        if (resumeFileService.searchByUserId(userId) == null){
            //插入
            return resumeFileService.insertResumefile(rFile);
        } else {
            //更新
            return resumeFileService.updateByUserId(rFile);
        }
    }
}
