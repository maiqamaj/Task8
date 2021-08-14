package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController	// This means that this class is a Controller
@RequestMapping(path="/") // This means URL's start with /demo (after Application path)
public class MainController  {
	
	@Autowired
	HrService Hr ;
	
	@RequestMapping(path= ("/list"), method=RequestMethod.GET)
	public ModelAndView getAllRegion()
	{ ModelAndView model=new ModelAndView();
		List <Region> region=null;
	 try {
	region=Hr.getAllRegion();
	region.forEach(System.out::println);
	model.addObject("list",region);
	model.setViewName("list");
	System.out.print("suscc");
	}catch(Exception E)
	 { System.out.println(E.getMessage());}
	
	return model;
	
}	
	
	@RequestMapping(path= ("/Alllist"), method=RequestMethod.GET)
	public ModelAndView getAllCountry()
	{ ModelAndView model=new ModelAndView();
		List <Country> region=null;
	 try {
	region=Hr.getAllCountry();
	region.forEach(System.out::println);
	model.addObject("Alllist",region);
	model.setViewName("Alllist");
	
	}catch(Exception E)
	 { System.out.println(E.getMessage());}
	
	return model;

}	
	
	 
	 @RequestMapping(value="/getRegion", method=RequestMethod.GET)
	 public ModelAndView GetRegion(Model model, @RequestParam("region_id") int region_id) {
	  
	  ModelAndView m = new ModelAndView();
	  Region emp  = Hr.getRegionById(region_id);
	  System.out.println(emp);
	  m.addObject("region", emp);
	  m.setViewName("region");
	  return m;
	 }
	 
	 
	 @RequestMapping(value="/getCountry", method=RequestMethod.GET)
	 public ModelAndView GetCountry(Model model, @RequestParam("country_id") String country_id) {
	  
	  ModelAndView m = new ModelAndView();
	  Country emp  = Hr.getContryById(country_id);
	  System.out.println(emp);
	  m.addObject("country", emp);
	  m.setViewName("country");
	  return m;
	 }
	 
	 
	 @RequestMapping(value="/Add", method=RequestMethod.GET)
	 public ModelAndView SaveCountry(Model model, @RequestParam("country_id") String country_id,@RequestParam("country_name") String country_name,@RequestParam("region_id") int region_id) {
	  
	  ModelAndView ModelContry = new ModelAndView();
      Region R = Hr.getRegionById(region_id);
      
	  Country c =new Country(country_id,country_name,R);
	  System.out.print(c);
	  Country emp  = Hr.addOrUpdateCountry(c);
	 
	  
	  return new ModelAndView("redirect:/Alllist");
	 }
}
	

