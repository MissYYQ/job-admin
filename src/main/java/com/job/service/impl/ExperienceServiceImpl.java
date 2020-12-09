package com.job.service.impl;

import com.job.mapper.ExperienceMapper;
import com.job.pojo.Experience;
import com.job.service.IExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements IExperienceService {

    @Autowired
    private ExperienceMapper experienceMapper;

    @Override
    public List<Experience> searchByUserId(Integer userId) {
        List<Experience> experienceList = experienceMapper.selectByUserId(userId);
        return experienceList;
    }

    @Override
    public int insertExperiences(List<Experience> experienceList) {
        int i = experienceMapper.insertExperiences(experienceList);
        return i;
    }

    @Override
    public int deleteByUserId(Integer userId) {
        int i = experienceMapper.deleteByUserId(userId);
        return i;
    }

    @Override
    public int insertExperience(Experience e) {
        int i = experienceMapper.insert(e);
        return i;
    }
}
