package com.job.controller;

import com.job.service.ICollectionUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/collection")
public class CollectionUserController {

    @Autowired
    private ICollectionUserService collectionUserService;

    @ResponseBody
    @RequestMapping("/userCount")
    public int userCount(Integer companyId){
        int count = collectionUserService.userCount(companyId);
        return count;
    }
}
