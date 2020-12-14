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

    @ResponseBody
    @RequestMapping("/userIsCollection")
    public Boolean IsCollection(Integer userId,Integer companyId){
        int i = collectionUserService.searchOne(userId, companyId);
        if (i == 0){
            return false;
        } else {
            return true;
        }
    }

    @ResponseBody
    @RequestMapping("/collectUser")
    public int collectUser(Integer userId,Integer companyId){
        int i = collectionUserService.collectUser(userId, companyId);
        return i;
    }

    @ResponseBody
    @RequestMapping("/uncollectUser")
    public int uncollectUser(Integer userId,Integer companyId){
        int i = collectionUserService.uncollectUser(userId, companyId);
        return i;
    }
}
