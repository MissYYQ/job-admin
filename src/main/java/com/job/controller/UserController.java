package com.job.controller;

import com.job.pojo.User;
import com.job.pojo.UserSession;
import com.job.service.IUserService;
import com.job.util.BaseData;
import com.job.util.HttpClientUtil;
import com.job.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/wxLogin")
    public BaseData login(String code,String nickName,String gender,String avatarUrl,String country,String province,String city){

        BaseData baseData = new BaseData();

        String appId = "wxcc92e6ab69b5576a";
        String appSecret = "816899e49f704b7d1f0e5c0190ced82c";
        String url = "https://api.weixin.qq.com/sns/jscode2session";

        Map<String, String> param = new HashMap<>();
        param.put("appid", appId);
        param.put("secret", appSecret);
        param.put("js_code", code);
        param.put("grant_type", "authorization_code");

        String wxResult = HttpClientUtil.doGet(url, param);
        UserSession session = JsonUtils.jsonToPojo(wxResult, UserSession.class);
        assert session != null;
        String openId = session.getOpenid();

        User user = new User();
        user.setOpenid(openId);
        user.setNickname(nickName);
        user.setGender(gender);
        user.setAvatarurl(avatarUrl);
        user.setCountry(country);
        user.setProvince(province);
        user.setCity(city);

        try {
            userService.userLogin(user);
            baseData.setSta(1);
            baseData.setObj(user);
            baseData.setMsg("登录成功");
        } catch (Exception e) {
            baseData.setSta(0);
            baseData.setMsg("登录失败");
        }
        return baseData;
    }
}
