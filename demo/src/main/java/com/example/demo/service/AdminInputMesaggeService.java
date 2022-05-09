package com.example.demo.service;

import com.example.demo.model.HelloEntity;
import com.example.demo.web.dto.MessageInputAdminDto;

public interface AdminInputMesaggeService  {
    HelloEntity save(MessageInputAdminDto messageInputAdminDto);

}
