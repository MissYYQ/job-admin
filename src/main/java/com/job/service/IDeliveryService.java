package com.job.service;

public interface IDeliveryService {

    void deliveryJob(Integer userId, Integer jobId, String deliveryTime);

    int isDelivery(Integer userId, Integer jobId);

    int deliveryCount(Integer userId);
}
