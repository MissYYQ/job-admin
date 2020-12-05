package com.job.service;

import com.job.pojo.Seminar;

import java.util.List;

public interface ISeminarService {

    List<Seminar> getAll();

    Seminar getOne(int id);

    List<Seminar> getSearchSeminar(String key);
}
