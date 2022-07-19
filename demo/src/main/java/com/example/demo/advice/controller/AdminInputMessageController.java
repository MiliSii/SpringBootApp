package com.example.demo.advice.controller;

import com.example.demo.model.dto.MessageInputAdminDto;
import com.example.demo.service.AdminInputMesaggeService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminMessageInput")
public class AdminInputMessageController {

	private AdminInputMesaggeService adminInputMesaggeService;

	public AdminInputMessageController(AdminInputMesaggeService adminInputMesaggeService) {
		super();
		this.adminInputMesaggeService = adminInputMesaggeService;
	}

	@ModelAttribute("helloEntity")
	public MessageInputAdminDto messageInputAdminDto() {
		return new MessageInputAdminDto();
	}

	@GetMapping
	public String showMessageForm() {
		return "admininput";
	}

	@PostMapping
	public String inputingMessage(@ModelAttribute("HelloEntity") MessageInputAdminDto messageInputAdminDto) {
		adminInputMesaggeService.save(messageInputAdminDto);
		return "redirect:/admininput?success";
	}
}
