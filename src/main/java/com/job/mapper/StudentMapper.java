package com.job.mapper;

import com.job.pojo.Student;
import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    Student selectByPrimaryKey(Integer id);

    List<Student> selectAll();

    int updateByPrimaryKey(Student record);

    Student selectByUserId(Integer userId);

    int deleteByUserId(Integer userId);

    int updateByUserId(Student student);

    List<Student> selectAllForCompanyIndex();

    List<Student> search(String key);

    List<Student> selectCollectUserByCompanyId(Integer companyId);
}