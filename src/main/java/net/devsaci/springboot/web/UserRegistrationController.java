package net.devsaci.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import net.devsaci.springboot.service.UserService;
import net.devsaci.springboot.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userservice) {
		super();
		this.userService = userservice;
	}
	
	public String registerUserAccount(@ModelAttribute("user") 
	UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
		
	}
	
	
	
	
}
