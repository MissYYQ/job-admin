package com.job.service;

import com.job.pojo.ResumeFile;

public interface IResumeFileService {
    ResumeFile searchByUserId(Integer userId);

    int insertResumefile(ResumeFile rFile);

    int updateByUserId(ResumeFile rFile);
}
