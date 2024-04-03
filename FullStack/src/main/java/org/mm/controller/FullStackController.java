package org.mm.controller;

import java.util.List;

import org.mm.model.AadharModel;
import org.mm.model.EducationModel;
import org.mm.model.LoginModel;
import org.mm.model.PanModel;
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
@RequestMapping(value = "/home")
public class FullStackController 
{
	@Autowired
	private LoginService service;
	
	private int LoginId;
	private int aadharId;
	private String address;
	private String addressPin;
	private String email;
	private String username;
	private String tenSchoolName;
	private String tenPassYear;
	private int tenPercentage;
	private String twelSchoolName;
	private String twelPassYear;
	private int twelPercentage;
	private String panName;
	private String panNo;
	
	
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
		address = um.getAddress();
		addressPin = um.getAddressPin();
		email = um.getEmail();
		username = l.getUsername();
		LoginId = l.getId();
		
		ModelAndView mv = new ModelAndView("Home/info");
		mv.addObject("hiddenImageAadhar", "hidden");
		mv.addObject("actionPath", "/FullStack/home/aadharAdd");
		mv.addObject("msg", "Record inserted"+id);
		
		mv.addObject("username", username);
		mv.addObject("addressPin", addressPin);
		mv.addObject("email", email);
		mv.addObject("address", address);
		
		mv.addObject("eduViewHidden", "hidden");
		
		return mv;
	}
	
	
	@RequestMapping(value = "/info",method = RequestMethod.POST)
	public ModelAndView verify(@RequestParam("username") String username, @RequestParam("password") String password)
	{
		List<LoginModel> li = service.loadAll();
		
		for(LoginModel m:li)
		{
			String name = m.getUsername();
			String pass = m.getPassword();
			if(name.equals(username)  && pass.equals(password))
			{
				
				AadharModel aadharModel = m.getAadharModel();
				PanModel panModel = m.getPanModel();
				LoginId = m.getId();
				UserDetailModel um = m.getUserDetailModel();
				address = um.getAddress();
				addressPin = um.getAddressPin();
				email = um.getEmail();
				
				if(aadharModel == null)
				{
					ModelAndView mv = new ModelAndView("Home/info");
					mv.addObject("hiddenImageAadhar", "hidden");
					mv.addObject("hiddenImagePan", "hidden");
					mv.addObject("address", address);
					mv.addObject("addressPin", addressPin);
					mv.addObject("email", email);
					mv.addObject("username", username);
					mv.addObject("eduViewHidden", "hidden");
					return mv;
				}
				else if (panModel == null)
				{
					String aadhar_Name = aadharModel.getAadharName();
					String aadhar_No = aadharModel.getAadharNo();
					
					EducationModel em = m.getEducationModel();
					
					tenSchoolName = em.getTenSchoolName();
					tenPassYear = em.getTenPassYear();
					tenPercentage = em.getTenPercentage();
					
					twelSchoolName = em.getTwelSchoolName();
					twelPassYear = em.getTwelPassYear();
					twelPercentage = em.getTwelPercentage();
					
					ModelAndView mv = new ModelAndView("Home/info");
					mv.addObject("hiddenImagePan", "hidden");
					mv.addObject("aadharName", aadhar_Name);
					mv.addObject("aadharNo", aadhar_No);
					mv.addObject("address", address);
					mv.addObject("addressPin", addressPin);
					mv.addObject("email", email);
					mv.addObject("username", username);
					mv.addObject("hiddenChooseAdhar", "hidden");
					mv.addObject("readonly", "readonly");
					
					mv.addObject("tenSchoolName", tenSchoolName);
					mv.addObject("tenPassYear", tenPassYear);
					mv.addObject("tenPercentage", tenPercentage);
					
					mv.addObject("twelSchoolName", twelSchoolName);
					mv.addObject("twelPassYear", twelPassYear);
					mv.addObject("twelPercentage", twelPercentage);
					
					mv.addObject("hiddenEducation", "hidden");
					
					return mv;
				}
				
				String aadhar_Name = aadharModel.getAadharName();
				String aadhar_No = aadharModel.getAadharNo();
				String pan_Name = panModel.getPanName();
				String pan_No = panModel.getPanNo();
				ModelAndView mv = new ModelAndView("Home/info");
				mv.addObject("aadharName", aadhar_Name);
				mv.addObject("aadharNo", aadhar_No);
				mv.addObject("hiddenChooseAdhar", "hidden");
				mv.addObject("panName", pan_Name);
				mv.addObject("panNo", pan_No);
				mv.addObject("hiddenChoosePan", "hidden");
				mv.addObject("address", address);
				mv.addObject("addressPin", addressPin);
				mv.addObject("email", email);
				mv.addObject("username", username);
				mv.addObject("msg", "succesfully Login, Welcome"+m.getUsername());
				mv.addObject("readonly", "readonly");
				
				mv.addObject("tenSchoolName", tenSchoolName);
				mv.addObject("tenPassYear", tenPassYear);
				mv.addObject("tenPercentage", tenPercentage);
				
				mv.addObject("twelSchoolName", twelSchoolName);
				mv.addObject("twelPassYear", twelPassYear);
				mv.addObject("twelPercentage", twelPercentage);
				
				mv.addObject("hiddenEducation", "hidden");
				
				mv.addObject("readonlypan", "readonly");
				
				return mv; 
			}

		}
		ModelAndView mv = new ModelAndView("login/lg");
		mv.addObject("notLoginMsg", "Username or Password is Incorrect !!!");
		return mv;
	}
	
	@RequestMapping(value = "/infoo")
	public String infoo()
	{
		return "Home/info";
	}
	
	@RequestMapping(value = "/aadharAdd", method = RequestMethod.POST)
	public ModelAndView aadharAdd(@ModelAttribute AadharModel am)
	{
		LoginModel lm = service.loadData(LoginId);
		UserDetailModel um = lm.getUserDetailModel();
		
		service.aadharSave(lm, am);
		String aadhar_Name = am.getAadharName();
		String aadhar_No = am.getAadharNo();
		aadharId = am.getId();
		ModelAndView mv = new ModelAndView("Home/info");
		mv.addObject("aadharName", aadhar_Name);
		mv.addObject("aadharNo", aadhar_No);
		mv.addObject("hiddenChooseAdhar", "hidden");
		mv.addObject("address", address);
		mv.addObject("addressPin", addressPin);
		mv.addObject("email", email);
		mv.addObject("username", username);
		mv.addObject("readonly", "readonly");
		
		mv.addObject("eduViewHidden", "hidden");
		mv.addObject("hiddenImagePan", "hidden");

		return mv;
	}
	
	@RequestMapping(value = "/panAdd", method = RequestMethod.POST)
	public ModelAndView panAdd(@ModelAttribute PanModel pm)
	{
		LoginModel lm = service.loadData(LoginId);
		UserDetailModel um = lm.getUserDetailModel();
		AadharModel am = lm.getAadharModel();
		
		service.panSave(lm, pm);
		panName = pm.getPanName();
		panNo = pm.getPanNo();
		String aadhar_Name = am.getAadharName();
		String aadhar_No = am.getAadharNo();
		aadharId = am.getId();
		ModelAndView mv = new ModelAndView("Home/info");
		mv.addObject("panName", panName);
		mv.addObject("panNo", panNo);
		mv.addObject("hiddenChoosePan", "hidden");	
		
		mv.addObject("aadharName", aadhar_Name);
		mv.addObject("aadharNo", aadhar_No);
		mv.addObject("hiddenChooseAdhar", "hidden");
		
		mv.addObject("address", address);
		mv.addObject("addressPin", addressPin);
		mv.addObject("email", email);
		mv.addObject("username", username);
		mv.addObject("readonly", "readonly");
		
		mv.addObject("tenSchoolName", tenSchoolName);
		mv.addObject("tenPassYear", tenPassYear);
		mv.addObject("tenPercentage", tenPercentage);
		
		mv.addObject("twelSchoolName", twelSchoolName);
		mv.addObject("twelPassYear", twelPassYear);
		mv.addObject("twelPercentage", twelPercentage);
		
		mv.addObject("hiddenEducation", "hidden");
		
		mv.addObject("readonlypan", "readonly");

		return mv;
	}
	
	@RequestMapping(value = "/eduSave", method = RequestMethod.POST)
	public ModelAndView eduSave(@ModelAttribute EducationModel em)
	{
		LoginModel lm = service.loadData(LoginId);
		service.SaveEdu(lm, em);
		AadharModel am = lm.getAadharModel();
		String aadharName = am.getAadharName();
		String aadharNo = am.getAadharNo();
		
		tenSchoolName = em.getTenSchoolName();
		tenPassYear = em.getTenPassYear();
		tenPercentage = em.getTenPercentage();
		
		twelSchoolName = em.getTwelSchoolName();
		twelPassYear = em.getTwelPassYear();
		twelPercentage = em.getTwelPercentage();
		
		ModelAndView mv = new ModelAndView("Home/info");
		
		mv.addObject("username", username);
		mv.addObject("addressPin", addressPin);
		mv.addObject("email", email);
		mv.addObject("address", address);
		
		mv.addObject("tenSchoolName", tenSchoolName);
		mv.addObject("tenPassYear", tenPassYear);
		mv.addObject("tenPercentage", tenPercentage);
		
		mv.addObject("twelSchoolName", twelSchoolName);
		mv.addObject("twelPassYear", twelPassYear);
		mv.addObject("twelPercentage", twelPercentage);
		
		mv.addObject("hiddenEducation", "hidden");
		
		mv.addObject("aadharName", aadharName);
		mv.addObject("aadharNo", aadharNo);
		mv.addObject("hiddenChooseAdhar", "hidden");
		mv.addObject("readonly", "readonly");
		
		mv.addObject("hiddenImagePan", "hidden");
		
		
		
		return mv;
	}
	
	@RequestMapping(value = "/Edit")
	public ModelAndView aadharEdit()
	{
		LoginModel lm = service.loadData(LoginId);
		AadharModel am = lm.getAadharModel();
//		PanModel pm = lm.getPanModel();
		String aadhar_Name = am.getAadharName();
		String aadhar_No = am.getAadharNo();
//		String pan_Name = pm.getPanName();
//		String pan_No = pm.getPanNo();
		
		ModelAndView mv = new ModelAndView("Home/info");

		mv.addObject("aadharName", aadhar_Name);
		mv.addObject("aadharNo", aadhar_No);
		mv.addObject("hiddenChooseAdhar", "hidden");
		
		mv.addObject("panName", panName);
		mv.addObject("panNo", panNo);
		mv.addObject("hiddenChoosePan", "hidden");
		
		mv.addObject("address", address);
		mv.addObject("addressPin", addressPin);
		mv.addObject("email", email);
		mv.addObject("username", username);
		
		mv.addObject("tenSchoolName", tenSchoolName);
		mv.addObject("tenPassYear", tenPassYear);
		mv.addObject("tenPercentage", tenPercentage);
		
		mv.addObject("twelSchoolName", twelSchoolName);
		mv.addObject("twelPassYear", twelPassYear);
		mv.addObject("twelPercentage", twelPercentage);
		
		mv.addObject("eduViewHidden", "hidden");
		
		return mv;
	}
//	@RequestMapping(value = "/aadharEdit", method = RequestMethod.POST)
//	public ModelAndView aadharEdit(@RequestParam("aadharName") String aadharName,@RequestParam("aadharNo") String aadharNo,@RequestParam("aadharImage") byte[] aadharImage)
//	{
//		
//		AadharModel am = new AadharModel(aadharId, aadharName, aadharNo, aadharImage);
//		service.aadharEdit(am);
//		
//		String aadhar_Name = am.getAadharName();
//		String aadhar_No = am.getAadharNo();
//		aadharId = am.getId();
//		System.out.println(aadharId);
//		ModelAndView mv = new ModelAndView("Home/info");
//		mv.addObject("aadharName", aadhar_Name);
//		mv.addObject("aadharNo", aadhar_No);
//		mv.addObject("hiddenChooseAdhar", "hidden");
//		return mv;
//	}
}
