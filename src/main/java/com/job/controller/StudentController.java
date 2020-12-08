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
    @RequestMapping("/edit")
    public Student edit(Integer userId, String resume){

        Student student = new Student();
        JSONObject jsonObject = JSON.parseObject(resume);

        student.setUserId(userId);
        student.setBirthday(jsonObject.getString("birthday"));
        student.setSkills(jsonObject.getString("skills"));
        student.setHometown(jsonObject.getString("hometown"));
        student.setEmail(jsonObject.getString("mailbox"));
        student.setEducation(jsonObject.getString("education"));
        student.setPhone(jsonObject.getString("phone"));
        student.setHonor(jsonObject.getString("honor"));
        student.setName(jsonObject.getString("name"));
        student.setPolitical(jsonObject.getString("political"));
        student.setAvatar(jsonObject.getString("avatar"));

        Student student1 = studentService.searchByUserId(userId);
        if (student1 == null){
            //插入
            studentService.insertStudent(student);
        } else {
            //删除再插入（更新）
            studentService.deleteStudentByUserId(userId);
            studentService.insertStudent(student);
        }
        return studentService.searchByUserId(userId);
    }
}
