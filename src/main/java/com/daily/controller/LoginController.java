package com.daily.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	private final Logger log = LoggerFactory.getLogger(LoginController.class);
	   @RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
	 		public ModelAndView errorPage(ModelMap model , Principal principal) {
		   		String userName = principal.getName();
		   		ModelAndView mv = new ModelAndView("accessdenied.html");
		   		mv.addObject("message", "sorry" +userName+" You don't have privileges to view this page!!!");
		   		return mv;
	 		}
	   @RequestMapping(value="/logout", method = RequestMethod.GET)
	   public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	       Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	       if (auth != null){    
	           new SecurityContextLogoutHandler().logout(request, response, auth);
	       }
	       return "redirect:/home?logout";
	   }
}
