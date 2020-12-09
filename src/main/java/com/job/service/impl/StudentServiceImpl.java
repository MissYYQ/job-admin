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
    public int insertStudent(Student student) {
        int n = studentMapper.insert(student);
        return n;
    }

    @Override
    public int deleteStudentByUserId(Integer userId) {
        int n = studentMapper.deleteByUserId(userId);
        return n;
    }

    @Override
    public int updateStudent(Student student) {
        int n = studentMapper.updateByUserId(student);
        return n;
    }
}
