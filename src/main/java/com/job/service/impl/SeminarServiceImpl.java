package com.job.service.impl;

import com.job.mapper.SeminarMapper;
import com.job.pojo.Seminar;
import com.job.service.ISeminarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeminarServiceImpl implements ISeminarService {

    @Autowired
    private SeminarMapper seminarMapper;

    @Override
    public List<Seminar> getAll() {
        List<Seminar> seminarList = seminarMapper.selectAll();
        return seminarList;
    }

    @Override
    public Seminar getOne(int id) {
        Seminar seminar = seminarMapper.selectByPrimaryKey(id);
        return seminar;
    }

    @Override
    public List<Seminar> getSearchSeminar(String key) {
        List<Seminar> seminarList = seminarMapper.selectSearchSeminar(key);
        return seminarList;
    }

}
