package com.gyan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyDemoController {

	@RequestMapping("/first")
	public ModelAndView welcomePage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Hello Ji !!");
		modelAndView.setViewName("welcome");
		return modelAndView;
		
	}
	
	@RequestMapping("/second")
	public ModelAndView welcomeAgainPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Hello Again Ji !!");
		modelAndView.setViewName("welcome");
		return modelAndView;
		
	}
}
