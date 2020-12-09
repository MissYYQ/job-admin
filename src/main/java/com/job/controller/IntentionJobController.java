package com.job.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.job.pojo.IntentionJob;
import com.job.service.IIntentionJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/intention")
public class IntentionJobController {

    @Autowired
    private IIntentionJobService intentionJobService;

    @ResponseBody
    @RequestMapping("/one")
    public IntentionJob getOne(Integer userId){
        IntentionJob intentionJob = intentionJobService.searchByUserId(userId);
        return intentionJob;
    }

    @ResponseBody
    @RequestMapping("/edit")
    public int edit(Integer userId,String intentionJob){

        JSONObject jsonObject = JSON.parseObject(intentionJob);
        IntentionJob intention = new IntentionJob();

        intention.setUserId(userId);
        intention.setJob(jsonObject.getString("job"));
        intention.setSalary(jsonObject.getString("salary"));
        intention.setCity(jsonObject.getString("city"));

        if (intentionJobService.searchByUserId(userId) == null){
            //插入
            return intentionJobService.insertIntention(intention);
        } else {
            //更新
            return intentionJobService.updateByUserId(intention);
        }
    }

}
