package net.devsaci.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}

	/* Another way */
	/*
	 * @GetMapping 
	 * public String showRegistrationForm(Model model) {
	 * model.addAttribute("user", new UserRegistrationDto()); 
	 * return "registration";
	 * }
	 */

	@GetMapping
	public String showRegistrationForm() {

		return "registration";
	}

	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";

	}

}
