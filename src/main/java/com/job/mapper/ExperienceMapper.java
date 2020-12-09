package com.job.mapper;

import com.job.pojo.Experience;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExperienceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Experience record);

    Experience selectByPrimaryKey(Integer id);

    List<Experience> selectAll();

    int updateByPrimaryKey(Experience record);

    List<Experience> selectByUserId(Integer userId);

    int insertExperiences(List<Experience> experienceList);

    int deleteByUserId(Integer userId);
}