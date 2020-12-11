package com.job.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
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

    @RequestMapping("/allForCompany")
    @ResponseBody
    public List<Seminar> getAllByCompanyId(Integer companyId){
        List<Seminar> seminarList = seminarService.getAllByCompanyId(companyId);
        return seminarList;
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(Integer id){
        int i = seminarService.delete(id);
        return i;
    }

    @RequestMapping("/add")
    @ResponseBody
    public int add(Integer companyId,String seminar){
        JSONObject jsonObject = JSON.parseObject(seminar);
        Seminar s = new Seminar();
        s.setCompanyId(companyId);
        s.setSchool(jsonObject.getString("school"));
        s.setLocation(jsonObject.getString("location"));
        s.setDate(jsonObject.getString("date"));
        s.setTime(jsonObject.getString("time"));
        int i = seminarService.add(s);
        return i;
    }

}
