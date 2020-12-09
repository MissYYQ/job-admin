package com.job.mapper;

import com.job.pojo.ResumeFile;
import java.util.List;

public interface ResumeFileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeFile record);

    ResumeFile selectByPrimaryKey(Integer id);

    List<ResumeFile> selectAll();

    int updateByPrimaryKey(ResumeFile record);

    ResumeFile selectByUserId(Integer userId);

    int updateByUserId(ResumeFile rFile);
}