package com.job.service.impl;

import com.job.mapper.StudentMapper;
import com.job.pojo.Student;
import com.job.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student searchByUserId(Integer userId) {
        Student student = studentMapper.selectByUserId(userId);
        return student;
    }

    @Override
    public void insertStudent(Student student) {
        studentMapper.insert(student);
    }

    @Override
    public void deleteStudentByUserId(Integer userId) {
        studentMapper.deleteByUserId(userId);
    }
}
