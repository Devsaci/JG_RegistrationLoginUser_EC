package net.devsaci.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.devsaci.springboot.model.User;
import net.devsaci.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto userRegistrationDto);

}
