package com.job.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.job.pojo.Delivery;
import com.job.service.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Console;
import java.lang.reflect.Array;
import java.util.List;

@Controller
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private IDeliveryService deliveryService;

    @ResponseBody
    @RequestMapping("/deliveryCount")
    public int deliveryCount(Integer userId) {
        int count = deliveryService.deliveryCount(userId);
        return count;
    }

    @ResponseBody
    @RequestMapping("/deliveryJob")
    public Boolean deliveryJob(Integer userId, Integer jobId, String deliveryTime) {
        deliveryService.deliveryJob(userId, jobId, deliveryTime);
        int deliveryJob = deliveryService.isDelivery(userId, jobId);
        if (deliveryJob != 0) {
            return true;
        }
        return false;
    }

    @ResponseBody
    @RequestMapping("/isDelivery")
    public Boolean deliveryJob(Integer userId, Integer jobId) {
        int deliveryJob = deliveryService.isDelivery(userId, jobId);
        if (deliveryJob != 0) {
            return true;
        }
        return false;
    }

    @ResponseBody
    @RequestMapping("/deal")
    public List<Delivery> deal(Integer companyId) {
        List<Delivery> deliveryList = deliveryService.deal(companyId);
        return deliveryList;
    }

    @ResponseBody
    @RequestMapping("/pass")
    public int pass(String idArr) {
        JSONArray jsonObject = JSON.parseArray(idArr);
        int p = 0;
        for (int i = 0; i < jsonObject.size(); i++) {
            Integer n = jsonObject.getInteger(i);
            p = deliveryService.pass(n);
        }
        return p;
    }

    @ResponseBody
    @RequestMapping("/fail")
    public int fail(String idArr) {
        JSONArray jsonObject = JSON.parseArray(idArr);
        int p = 0;
        for (int i = 0; i < jsonObject.size(); i++) {
            Integer n = jsonObject.getInteger(i);
            p = deliveryService.fail(n);
        }
        return p;
    }

    @ResponseBody
    @RequestMapping("/interview")
    public int interview(String idArr) {
        JSONArray jsonObject = JSON.parseArray(idArr);
        int p = 0;
        for (int i = 0; i < jsonObject.size(); i++) {
            Integer n = jsonObject.getInteger(i);
            p = deliveryService.interview(n);
        }
        return p;
    }

    @ResponseBody
    @RequestMapping("/accept")
    public int accept(Integer id) {
        int i = deliveryService.accept(id);
        return i;
    }

    @ResponseBody
    @RequestMapping("/refuse")
    public int refuse(Integer id) {
        int i = deliveryService.refuse(id);
        return i;
    }

    @CrossOrigin
    @ResponseBody
    @RequestMapping("/count")
    public int count() {
        int count = deliveryService.count();
        return count;
    }

}
