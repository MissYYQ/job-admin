package com.job.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.job.pojo.Student;
import com.job.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @ResponseBody
    @RequestMapping("/one")
    public Student getOne(Integer userId){
        Student student = studentService.searchByUserId(userId);
        return student;
    }

    @ResponseBody
    @RequestMapping("/edit")
    public int edit(Integer userId, String resume){

        JSONObject jsonObject = JSON.parseObject(resume);
        Student student = new Student();

        student.setUserId(userId);
        student.setBirthday(jsonObject.getString("birthday"));
        student.setSkills(jsonObject.getString("skills"));
        student.setHometown(jsonObject.getString("hometown"));
        student.setEmail(jsonObject.getString("email"));
        student.setEducation(jsonObject.getString("education"));
        student.setPhone(jsonObject.getString("phone"));
        student.setHonor(jsonObject.getString("honor"));
        student.setName(jsonObject.getString("name"));
        student.setPolitical(jsonObject.getString("political"));
        student.setAvatar(jsonObject.getString("avatar"));

        if (studentService.searchByUserId(userId) == null){
            //插入
             return studentService.insertStudent(student);
        } else {
            //更新
             return studentService.updateStudent(student);
        }
    }
}
