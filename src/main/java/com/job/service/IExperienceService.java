package com.job.service;

import com.job.pojo.Experience;

import java.util.List;

public interface IExperienceService {

    List<Experience> searchByUserId(Integer userId);

    int insertExperiences(List<Experience> experienceList);

    int deleteByUserId(Integer userId);

    int insertExperience(Experience e);
}
