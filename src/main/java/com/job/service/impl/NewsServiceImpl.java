package com.job.service.impl;

import com.job.mapper.NewsMapper;
import com.job.pojo.News;
import com.job.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements INewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public int countStudentId(Integer studentId) {
        int count = newsMapper.selectCountByStudentId(studentId);
        return count;
    }

    @Override
    public int countCompanyId(Integer companyId) {
        int count = newsMapper.selectCountByCompanyId(companyId);
        return count;
    }

    @Override
    public int add(News news) {
        int i = newsMapper.insert(news);
        return i;
    }

    @Override
    public List<News> allStudentId(Integer studentId) {
        List<News> newsList = newsMapper.selectAllByStudentId(studentId);
        return newsList;
    }

    @Override
    public List<News> allCompanyId(Integer companyId) {
        List<News> newsList = newsMapper.selectAllByCompanyId(companyId);
        return newsList;
    }

}
