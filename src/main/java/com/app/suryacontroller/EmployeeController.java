package com.app.suryacontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	@RequestMapping(value ="/show", method = RequestMethod.GET)
	public String showData()
	{
		return"EmpHome";
	}

}
