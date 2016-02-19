package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingsController {
	
	@RequestMapping(value="html", method = RequestMethod.GET )
	public String greeting() {
		
		return "/Users/rain/Documents/workspace-sts-3.7.2.RELEASE/demo/src/main/resources/templates/welcome.html";
	}
	
}
