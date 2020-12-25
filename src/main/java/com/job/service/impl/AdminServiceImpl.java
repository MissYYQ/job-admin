package com.job.service.impl;

import com.job.mapper.AdminMapper;
import com.job.pojo.Admin;
import com.job.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(String username, String password) {
        Admin admin = adminMapper.login(username, password);
        return admin;
    }
}
