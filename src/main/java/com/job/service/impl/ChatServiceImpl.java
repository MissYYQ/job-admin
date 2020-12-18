package com.job.service.impl;

import com.job.mapper.ChatMapper;
import com.job.pojo.Chat;
import com.job.service.IChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements IChatService {

    @Autowired
    private ChatMapper chatMapper;

    @Override
    public int countStudentId(Integer studentId) {
        int count = chatMapper.selectCountByStudentId(studentId);
        return count;
    }

    @Override
    public int countCompanyId(Integer companyId) {
        int count = chatMapper.selectCountByCompanyId(companyId);
        return count;
    }

    @Override
    public int add(Chat chat) {
        int i = chatMapper.insert(chat);
        return i;
    }

    @Override
    public List<Chat> allStudentId(Integer studentId) {
        List<Chat> chatList = chatMapper.selectAllByStudentId(studentId);
        return chatList;
    }

    @Override
    public List<Chat> allCompanyId(Integer companyId) {
        List<Chat> chatList = chatMapper.selectAllByCompanyId(companyId);
        return chatList;
    }

    @Override
    public List<Chat> one(Integer companyId, Integer studentId) {
        List<Chat> chatList = chatMapper.selectOne(companyId,studentId);
        return chatList;
    }
}
