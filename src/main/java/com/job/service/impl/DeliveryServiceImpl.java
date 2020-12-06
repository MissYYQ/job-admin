package com.job.service.impl;

import com.job.mapper.DeliveryMapper;
import com.job.service.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryServiceImpl implements IDeliveryService {

    @Autowired
    private DeliveryMapper deliveryMapper;

    @Override
    public void deliveryJob(Integer userId, Integer jobId, String deliveryTime) {
        deliveryMapper.deliveryJob(userId,jobId,deliveryTime);
    }

    @Override
    public int isDelivery(Integer userId, Integer jobId) {
        int delivery = deliveryMapper.isDelivery(userId, jobId);
        return delivery;
    }

    @Override
    public int deliveryCount(Integer userId) {
        int count = deliveryMapper.deliveryCount(userId);
        return count;
    }
}
