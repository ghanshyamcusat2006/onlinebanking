/**
 *  Copyright 2012 Society for Health Information Systems Programmes, India (HISP India)
 *
 *  This file is part of Dms module.
 *
 *  Dms module is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.

 *  Dms module is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Dms module.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/

package com.onlinebanking.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onlinebanking.model.Employee;
import com.onlinebanking.model.Users;
import com.onlinebanking.service.OnlinebankingService;
import com.onlinebanking.service.OnlinebankingXmlService;

/**
 * The main controller.
 */
@Controller
public class  OnlinebankingMainController {
	
	@Autowired
	private OnlinebankingService onlinebankingService;
	
	@Autowired
	private OnlinebankingXmlService onlinebankingXmlService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String welcome(Model model) {
		
		//model.addAttribute("propertyList",propertyList);
		return "index";
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String onSubmit(Model model, HttpServletRequest request) {
	
	String abc=request.getParameter("name");
	Employee employee=new Employee();
	employee.setFirstName(abc);
	onlinebankingService.saveOrUpdateEmployee(employee);
	
	Users users=new Users();
	users.setName(abc);
	onlinebankingXmlService.saveOrUpdateUsers(users);
	return "index";
	}
}
