package com.job.service;

import com.job.pojo.Chat;

import java.util.List;

public interface IChatService {
    int countStudentId(Integer studentId);

    int countCompanyId(Integer companyId);

    int add(Chat chat);

    List<Chat> allStudentId(Integer studentId);

    List<Chat> allCompanyId(Integer companyId);

    List<Chat> one(Integer companyId, Integer studentId);
}
