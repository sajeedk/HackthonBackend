package com.hackathon.test.hackthontest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.test.hackthontest.pojo.Container;
import com.hackathon.test.hackthontest.service.MainService;

@CrossOrigin(origins = "*")
@RestController
public class MainController {
	
	@Autowired
	MainService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getRestSevice(Model model)
	{
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "index";
	}
	
	@GetMapping(value="/credit")
	public String getCreditData()
	{
		return null;
		
	}
	
	@GetMapping(value="/container/{id}")
	public Optional<Container> getById(@PathVariable(value="id") String id)
	{
		return service.findById(id);
		
	}
	
	@PostMapping(value="/container/getItem/")
	public Container getById(Container container)
	{
		return service.saveItem(container);
		
	}

}
