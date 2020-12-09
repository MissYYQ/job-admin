package com.job.controller;

import com.alibaba.fastjson.JSON;
import com.job.pojo.Experience;
import com.job.service.IExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Type;
import java.util.List;

@Controller
@RequestMapping("/experience")
public class ExperienceController {

    @Autowired
    private IExperienceService experienceService;

    @ResponseBody
    @RequestMapping("/allByUser")
    public List<Experience> searchByUserId(Integer userId){
        List<Experience> experienceList = experienceService.searchByUserId(userId);
        return experienceList;
    }

    @ResponseBody
    @RequestMapping("/edit")
    public int edit(Integer userId,String experience){
        //json转list
        List<Experience> experienceList = JSON.parseArray(experience,Experience.class);

//        System.out.println(experienceList);
//        System.out.println("类型：");
//        System.out.println(experienceList.getClass().toString());
//
//        if (experienceService.searchByUserId(userId) == null){
//            //逐一插入
//            for (int i = 0; i < experienceList.size(); i++) {
//                Experience e = experienceList.get(i);
//                e.setUserId(userId);
//                experienceService.insertExperience(e);
//            }
//            if (experienceService.searchByUserId(userId) != null){
//                return 1;
//            } else {
//                return 0;
//            }
//        } else {
//            //删除再插入
//            experienceService.deleteByUserId(userId);
//            for (int i = 0; i < experienceList.size(); i++) {
//                Experience e = experienceList.get(i);
//                e.setUserId(userId);
//                experienceService.insertExperience(e);
//            }
//            if (experienceService.searchByUserId(userId) != null){
//                return 1;
//            } else {
//                return 0;
//            }
//        }

        for (int i = 0; i < experienceList.size(); i++) {
            experienceList.get(i).setUserId(userId);
        }
        if (experienceService.searchByUserId(userId) == null){
            //插入
            return experienceService.insertExperiences(experienceList);
        } else {
            //删除再插入
            experienceService.deleteByUserId(userId);
            return experienceService.insertExperiences(experienceList);
        }

    }
}
