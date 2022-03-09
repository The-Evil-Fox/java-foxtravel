package com.travel.fox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DestinationController {
	
	@GetMapping(value= "/sri-lanka" )
	public ModelAndView sriLanka(ModelAndView mv) {
		
		mv.setViewName("sri-lanka");
		return mv;
		
	}
	
	@GetMapping(value= "/japan" )
	public ModelAndView japan(ModelAndView mv) {
		
		mv.setViewName("japan");
		return mv;
		
	}
	
	@GetMapping(value= "/switzerland" )
	public ModelAndView switzerland(ModelAndView mv) {
		
		mv.setViewName("switzerland");
		return mv;
		
	}
	
	@GetMapping(value= "/italia" )
	public ModelAndView venice(ModelAndView mv) {
		
		mv.setViewName("italia");
		return mv;
		
	}

}
