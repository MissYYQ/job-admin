package com.job.service;

import com.job.pojo.Student;

public interface IStudentService {

    Student searchByUserId(Integer userId);

    int insertStudent(Student student);

    int deleteStudentByUserId(Integer userId);

    int updateStudent(Student student);
}
