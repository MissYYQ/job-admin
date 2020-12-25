package com.job.service;

import com.job.pojo.Admin;

public interface IAdminService {
    Admin login(String username, String password);
}
