package com.job.controller;

import com.job.pojo.Seminar;
import com.job.service.ISeminarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/seminar")
public class SeminarController {

    @Autowired
    private ISeminarService seminarService;

    @RequestMapping("/all")
    @ResponseBody
    public List<Seminar> getAll(){
        List<Seminar> seminarList = seminarService.getAll();
        return seminarList;
    }

    @RequestMapping("/one")
    @ResponseBody
    public Seminar getOne(int id){
        Seminar seminar = seminarService.getOne(id);
        return seminar;
    }

    @RequestMapping("/search")
    @ResponseBody
    public List<Seminar> search(String key){
        List<Seminar> seminarList = seminarService.getSearchSeminar(key);
        return seminarList;
    }

}
