package net.devsaci.springboot.service;

import net.devsaci.springboot.model.User;
import net.devsaci.springboot.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto userRegistrationDto);

}
