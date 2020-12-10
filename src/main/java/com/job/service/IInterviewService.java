package com.job.service;

import com.job.pojo.Interview;

import java.util.List;

public interface IInterviewService {
    List<Interview> selectByUserId(Integer userId);

    int countByUserId(Integer userId);

    int selectCountByCompanyId(Integer companyId);
}
