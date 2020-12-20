package com.job.controller;

import com.job.pojo.Chat;
import com.job.service.IChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private IChatService chatService;

    @ResponseBody
    @RequestMapping("/one")
    public List<Chat> one(Integer companyId,Integer studentId){
        List<Chat> chatList = chatService.one(companyId,studentId);
        return chatList;
    }

    @ResponseBody
    @RequestMapping("/add")
    public int add(Integer studentId,Integer companyId,Integer jobId, String message,Integer sender){
        Chat chat = new Chat();
        chat.setStudentId(studentId);
        chat.setCompanyId(companyId);
        chat.setJobId(jobId);
        chat.setMessage(message);
        chat.setSender(sender);
        int i = chatService.add(chat);
        return i;
    }
}
