package net.devsaci.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
	
	
	
	
	/* Step 9 - Home PAge Implemenetation 
	 * @
	 */
	
	  @GetMapping("/") 
	  public String home() { 
		  return "index"; }
	 
	
}
