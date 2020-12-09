package com.job.service.impl;

import com.job.mapper.ResumeFileMapper;
import com.job.pojo.ResumeFile;
import com.job.service.IResumeFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeFileServiceImpl implements IResumeFileService {

    @Autowired
    private ResumeFileMapper resumeFileMapper;

    @Override
    public ResumeFile searchByUserId(Integer userId) {
        ResumeFile resumeFile = resumeFileMapper.selectByUserId(userId);
        return resumeFile;
    }

    @Override
    public int insertResumefile(ResumeFile rFile) {
        int i = resumeFileMapper.insert(rFile);
        return i;
    }

    @Override
    public int updateByUserId(ResumeFile rFile) {
        int i = resumeFileMapper.updateByUserId(rFile);
        return i;
    }
}
