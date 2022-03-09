package com.travel.fox.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.travel.fox.dao.CustomerRepository;
import com.travel.fox.dao.MessageRepository;
import com.travel.fox.model.Customer;
import com.travel.fox.model.Message;

@Controller
public class ContactController {
	
	@Autowired
    private CustomerRepository customerRepository;
	
	@Autowired
    private MessageRepository messageRepository;
	
	@GetMapping(value="/contact")
	public ModelAndView contact(ModelAndView mv) {
		
		mv.setViewName("contact");
		return mv;
		
	}
	
	@PostMapping(value = "/contact")
    public ModelAndView addPerson(@RequestParam(value = "name") String name, 
    		@RequestParam(value = "firstname") String firstname,
    		@RequestParam(value = "email") String email,
    		@RequestParam(value = "message") String message) {
		
		if(name.equals("") || firstname.equals("") || email.equals("") || message.equals("")) {
			
			ModelAndView mv = new ModelAndView();
			String error = "Veuillez remplir touts les champs !";
	        mv.setViewName("contact");
	        mv.addObject("error", error);
	        return mv;
			
		}
		
		Customer c1 = new Customer();
		
		List<Customer> customer = customerRepository.findByEmail(email);
		
		if(customer.isEmpty()) {
			
			c1.setName(name);
			c1.setFirstname(firstname);
			c1.setEmail(email);
			
		} else {
			
			c1 = customer.get(0);
			
		}
		
		Message userMessage = new Message();
		userMessage.setMessage(message);
		
		c1.addMessage(userMessage);
		
		try {
			
			customerRepository.save(c1);
			messageRepository.save(userMessage);
			
		} catch(Exception e) {
			
			ModelAndView mv = new ModelAndView();
			String error = e.getStackTrace().toString();
	        mv.setViewName("contact");
	        mv.addObject("error", error);
	        return mv;
			
		}
		
		ModelAndView mv = new ModelAndView();
		String confirmation = "Votre message a bien été reçu !";
        mv.setViewName("contact");
        mv.addObject("confirmation", confirmation);
        return mv;
        
    }

}
