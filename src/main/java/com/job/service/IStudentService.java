package com.job.service;

import com.job.pojo.Student;

public interface IStudentService {

    Student searchByUserId(Integer userId);

    void insertStudent(Student student);

    void deleteStudentByUserId(Integer userId);

}
