package com.job.mapper;

import com.job.pojo.Delivery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeliveryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Delivery record);

    Delivery selectByPrimaryKey(Integer id);

    List<Delivery> selectAll();

    int updateByPrimaryKey(Delivery record);

    void deliveryJob(@Param("userId")Integer userId, @Param("jobId")Integer jobId, @Param("deliveryTime")String deliveryTime);

    int isDelivery(@Param("userId")Integer userId,  @Param("jobId")Integer jobId);

    int deliveryCount(Integer userId);
}