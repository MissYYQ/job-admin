package com.job.controller;

import com.job.service.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private IDeliveryService deliveryService;

    @ResponseBody
    @RequestMapping("/deliveryCount")
    public int deliveryCount(Integer userId){
        int count = deliveryService.deliveryCount(userId);
        return count;
    }

    @ResponseBody
    @RequestMapping("/deliveryJob")
    public Boolean deliveryJob(Integer userId,Integer jobId,String deliveryTime){
        deliveryService.deliveryJob(userId,jobId,deliveryTime);
        int deliveryJob = deliveryService.isDelivery(userId, jobId);
        if (deliveryJob != 0){
            return true;
        }
        return false;
    }

    @ResponseBody
    @RequestMapping("/isDelivery")
    public Boolean deliveryJob(Integer userId,Integer jobId){
        int deliveryJob = deliveryService.isDelivery(userId, jobId);
        if (deliveryJob != 0){
            return true;
        }
        return false;
    }
}
