package com.job.service;

import com.job.pojo.News;

import java.util.List;

public interface INewsService {
    int countStudentId(Integer studentId);

    int countCompanyId(Integer companyId);

    int add(News news);

    List<News> allStudentId(Integer studentId);

    List<News> allCompanyId(Integer companyId);

}
