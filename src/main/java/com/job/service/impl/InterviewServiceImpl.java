package com.job.service.impl;

import com.job.mapper.InterviewMapper;
import com.job.pojo.Interview;
import com.job.service.IInterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewServiceImpl implements IInterviewService {

    @Autowired
    private InterviewMapper interviewMapper;

    @Override
    public List<Interview> selectByUserId(Integer userId) {
        List<Interview> interviewList = interviewMapper.selectByUserId(userId);
        return interviewList;
    }

    @Override
    public int countByUserId(Integer userId) {
        int count = interviewMapper.selectCountByUserId(userId);
        return count;
    }

    @Override
    public int selectCountByCompanyId(Integer companyId) {
        int count = interviewMapper.selectCountByCompanyId(companyId);
        return count;
    }
}
