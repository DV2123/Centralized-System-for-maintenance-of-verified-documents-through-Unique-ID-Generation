package org.mm.controller;

import java.util.List;

import org.mm.model.LoginModel;
import org.mm.model.UserDetailModel;
import org.mm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/login")
public class LoginController 
{
	@Autowired
	private LoginService service;
	
	private int id;
	
	public int loginId()
	{
		return id;
	}
	
	@RequestMapping(value = "/create")
	public ModelAndView create()
	{
		return new ModelAndView("login/create");
	}
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute LoginModel l,@ModelAttribute UserDetailModel um)
	{
		int id = service.Save(l);
		service.SaveDetails(l, um);
		String address = um.getAddress();
		String addressPin = um.getAddressPin();
		String email = um.getEmail();
		String username = l.getUsername();
		id = l.getId();
		System.out.println(id);
		
		ModelAndView mv = new ModelAndView("Home/info");
		mv.addObject("hiddenImageAadhar", "hidden");
		mv.addObject("actionPath", "/FullStack/home/aadharAdd");
		mv.addObject("msg", "Record inserted"+id);
		
		mv.addObject("username", username);
		mv.addObject("addressPin", addressPin);
		mv.addObject("email", email);
		mv.addObject("address", address);
		
		return mv;
	}

	@RequestMapping(value = "/lg")
	public String lg()
	{
		return "login/lg";
	}
	
	@RequestMapping(value = "/edit")
	public String editTest()
	{
		return "Home/info";
	}
	
//	@RequestMapping(value = "/verify",method = RequestMethod.POST)
//	public ModelAndView verify(@RequestParam("username") String username, @RequestParam("password") String password)
//	{
//		List<LoginModel> li = service.loadAll();
//		
//		for(LoginModel m:li)
//		{
//			String name = m.getUsername();
//			String pass = m.getPassword();
//			if(name.equals(username)  && pass.equals(password))
//			{
//				ModelAndView mv = new ModelAndView("login/lgSucces");
//				
//				mv.addObject("msg", "succesfully Login, Welcome"+m.getUsername());
//				
//				return mv; 
//			}
//
//		}
//		ModelAndView mv = new ModelAndView("login/lg");
//		mv.addObject("notLoginMsg", "Username or Password is Incorrect !!!");
//		return mv;
//	}
	
	
}
