package com.job.service;

import com.job.pojo.Student;

import java.util.List;

public interface IStudentService {

    Student searchByUserId(Integer userId);

    int insertStudent(Student student);

    int updateStudent(Student student);

    List<Student> allForCompanyIndex();

    List<Student> search(String key);

    List<Student> selectCollectUserByCompanyId(Integer companyId);

    int getCount();

}
