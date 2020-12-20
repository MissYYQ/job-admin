package com.job.service;

import com.job.pojo.Chat;

import java.util.List;

public interface IChatService {

    int add(Chat chat);

    List<Chat> one(Integer companyId, Integer studentId);
}
