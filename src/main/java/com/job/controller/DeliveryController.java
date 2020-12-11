package com.job.controller;

import com.job.pojo.Delivery;
import com.job.service.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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

    @ResponseBody
    @RequestMapping("/deal")
    public List<Delivery> deal(Integer companyId){
        List<Delivery> deliveryList = deliveryService.deal(companyId);
        return deliveryList;
    }

    @ResponseBody
    @RequestMapping("/pass")
    public int pass(Integer id){
        int i = deliveryService.pass(id);
        return i;
    }

    @ResponseBody
    @RequestMapping("/fail")
    public int fail(Integer id){
        int i = deliveryService.fail(id);
        return i;
    }

    @ResponseBody
    @RequestMapping("/interview")
    public int interview(Integer id){
        int i = deliveryService.interview(id);
        return i;
    }
}
