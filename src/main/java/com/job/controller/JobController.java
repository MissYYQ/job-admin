package com.job.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.job.pojo.Job;
import com.job.service.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/job")
public class JobController {

    @Autowired
    private IJobService jobService;

    /**
     * 获取所有职位
     * @return 所有职位的集合
     */
    @ResponseBody
    @RequestMapping("/all")
    public List<Job> getAll(){
        List<Job> jobList = jobService.getAll();
        return jobList;
    }

    /**
     * 学生端首页的搜索
     * @param key 关键字（职位名称/企业名称）
     * @return 匹配的职位集合
     */
    @ResponseBody
    @RequestMapping("/search")
    public List<Job> getSearchJob(String key){
        List<Job> jobList = jobService.getSearchJob(key);
        return jobList;
    }

    /**
     * 学生端热门职位页面的搜索
     * @param key 职位名称
     * @return 匹配的职位集合
     */
    @ResponseBody
    @RequestMapping("/hotJobSearch")
    public List<Job> searchHotJob(String key){
        List<Job> jobList = jobService.getSearchHotJob(key);
        return jobList;
    }

    /**
     * 根据id获取单个职位及与其关联的公司信息
     * @param id 职位编号
     * @return 匹配的单个职位及其公司信息
     */
    @ResponseBody
    @RequestMapping("/one")
    public Job getOne(int id){
        Job job = jobService.getOne(id);
        return job;
    }

    /**
     * 根据企业编号获取职位集合
     * @param id 企业编号
     * @return 该企业的所有职位集合
     */
    @ResponseBody
    @RequestMapping("/jobForCompany")
    public List<Job> getJobByCompanyId(int id){
        List<Job> jobList = jobService.getJobByCompanyId(id);
        return jobList;
    }

    /**
     * 增加该职位的预览量
     * @param id 职位编号
     */
    @ResponseBody
    @RequestMapping("/addPageviews")
    public void addPageviews(int id){
        jobService.addPageviews(id);
    }

    /**
     * 根据预览量排序得到热门职位
     * @return 根据预览量排序的所有职位的集合
     */
    @ResponseBody
    @RequestMapping("/hotJob")
    public List<Job> hotJob(){
        List<Job> jobList = jobService.getHotJob();
        return jobList;
    }

    /**
     * 获取用户的所有收藏职位
     * @param userId 用户编号
     * @return 该用户收藏职位的集合
     */
    @ResponseBody
    @RequestMapping("/collectJob")
    public List<Job> collectJob(Integer userId){
        List<Job> jobList = jobService.getCollectJob(userId);
        return jobList;
    }

    /**
     * 获取用户投递的职位集合
     * @param userId 用户编号
     * @return 用户投递的职位集合
     */
    @ResponseBody
    @RequestMapping("/deliveryJob")
    public List<Job> deliveryJob(Integer userId){
        List<Job> deliveryJob = jobService.getDeliveryJob(userId);
        return deliveryJob;
    }


    /**
     * 获取企业的职位数量
     * @param companyId 企业编号
     * @return 该企业的职位数量
     */
    @ResponseBody
    @RequestMapping("/countByCompanyId")
    public int countByCompanyId(Integer companyId){
        int count = jobService.getCountByCompanyId(companyId);
        return count;
    }

    /**
     * 更新职位
     * @param id 职位编号
     * @param companyId 公司编号
     * @param job 职位
     * @return 变动量
     */
    @ResponseBody
    @RequestMapping("/update")
    public int update(Integer id,Integer companyId,String job){
        JSONObject jsonObject = JSON.parseObject(job);
        Job j = new Job();
        j.setId(id);
        j.setCompanyId(companyId);
        j.setName(jsonObject.getString("name"));
        j.setSalary(jsonObject.getString("salary"));
        j.setCity(jsonObject.getString("city"));
        j.setExperience(jsonObject.getString("experience"));
        j.setDegree(jsonObject.getString("degree"));
        j.setClaim(jsonObject.getString("claim"));
        j.setDuty(jsonObject.getString("duty"));
        j.setKeywords(jsonObject.getString("keywords"));
        j.setIndustry(jsonObject.getString("industry"));
        j.setDeadline(jsonObject.getString("deadline"));
        j.setKind(jsonObject.getInteger("kind"));
        int i = jobService.update(j);
        return i;
    }

    @ResponseBody
    @RequestMapping("/add")
    public int update(Integer companyId,String job){
        JSONObject jsonObject = JSON.parseObject(job);
        Job j = new Job();
        j.setCompanyId(companyId);
        j.setName(jsonObject.getString("name"));
        j.setSalary(jsonObject.getString("salary"));
        j.setCity(jsonObject.getString("city"));
        j.setExperience(jsonObject.getString("experience"));
        j.setDegree(jsonObject.getString("degree"));
        j.setClaim(jsonObject.getString("claim"));
        j.setDuty(jsonObject.getString("duty"));
        j.setKeywords(jsonObject.getString("keywords"));
        j.setIndustry(jsonObject.getString("industry"));
        j.setKind(jsonObject.getInteger("kind"));
        int i = jobService.add(j);
        return i;
    }

    /**
     * 删除单个职位
     * @param id 职位编号
     * @return 变动的数据量
     */
    @ResponseBody
    @RequestMapping("/delete")
    public int delete(Integer id){
        int i = jobService.delete(id);
        return i;
    }

}
