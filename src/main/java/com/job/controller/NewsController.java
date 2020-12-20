package com.job.controller;

import com.job.pojo.News;
import com.job.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private INewsService newsService;

    @ResponseBody
    @RequestMapping("/countStudentId")
    public int countStudentId(Integer studentId){
        int count = newsService.countStudentId(studentId);
        return count;
    }

    @ResponseBody
    @RequestMapping("/countCompanyId")
    public int countCompanyId(Integer companyId){
        int count = newsService.countCompanyId(companyId);
        return count;
    }

    @ResponseBody
    @RequestMapping("/add")
    public int add(Integer studentId,Integer companyId,Integer jobId, String lastMessage,String lastDate){
        News news = new News();
        news.setStudentId(studentId);
        news.setCompanyId(companyId);
        news.setJobId(jobId);
        news.setLastmessage(lastMessage);
        news.setLastdate(lastDate);
        News one = newsService.searchOne(studentId, companyId);
        if (one != null){
            //更新last
            int i = newsService.updateLast(news);
            return i;
        } else {
            //插入
            int i = newsService.add(news);
            return i;
        }
    }

    @ResponseBody
    @RequestMapping("/allStudentId")
    public List<News> allStudentId(Integer studentId){
        List<News> newsList = newsService.allStudentId(studentId);
        return newsList;
    }

    @ResponseBody
    @RequestMapping("/allCompanyId")
    public List<News> allCompanyId(Integer companyId){
        List<News> newsList = newsService.allCompanyId(companyId);
        return newsList;
    }

}
