package com.job.service.impl;

import com.job.mapper.DeliveryMapper;
import com.job.pojo.Delivery;
import com.job.service.IDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<Delivery> deal(Integer companyId) {
        List<Delivery> deliveryList = deliveryMapper.selectDeal(companyId);
        return deliveryList;
    }

    @Override
    public int pass(Integer id) {
        int i = deliveryMapper.pass(id);
        return i;
    }

    @Override
    public int fail(Integer id) {
        int i = deliveryMapper.fail(id);
        return i;
    }

    @Override
    public int interview(Integer id) {
        int i = deliveryMapper.interview(id);
        return i;
    }

    @Override
    public int accept(Integer id) {
        int i = deliveryMapper.accept(id);
        return i;
    }

    @Override
    public int refuse(Integer id) {
        int i = deliveryMapper.refuse(id);
        return i;
    }

    @Override
    public int count() {
        int i = deliveryMapper.selectCount();
        return i;
    }
}
