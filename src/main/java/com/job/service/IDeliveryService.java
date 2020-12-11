package com.job.service;

import com.job.pojo.Delivery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IDeliveryService {

    void deliveryJob(@Param("userId")Integer userId, @Param("jobId")Integer jobId, @Param("deliveryTime")String deliveryTime);

    int isDelivery(Integer userId, Integer jobId);

    int deliveryCount(Integer userId);

    List<Delivery> deal(Integer companyId);

    int pass(Integer id);

    int fail(Integer id);

    int interview(Integer id);
}
