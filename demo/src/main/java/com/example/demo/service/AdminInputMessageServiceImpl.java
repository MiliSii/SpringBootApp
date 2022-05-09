package com.example.demo.service;

import com.example.demo.model.HelloEntity;
import com.example.demo.repository.AdminRepository;
import com.example.demo.web.dto.MessageInputAdminDto;


import org.springframework.stereotype.Service;

@Service
public class AdminInputMessageServiceImpl implements AdminInputMesaggeService {

	private AdminRepository adminRepository;

	public AdminInputMessageServiceImpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	@Override
	public HelloEntity save(MessageInputAdminDto messageInputAdminDto) {
		HelloEntity helloEntity = new HelloEntity(null, messageInputAdminDto.getLang(),
				messageInputAdminDto.getHelloDifLeng());

		return adminRepository.save(helloEntity);
	}

	


}
