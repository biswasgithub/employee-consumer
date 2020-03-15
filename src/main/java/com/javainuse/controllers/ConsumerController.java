package com.javainuse.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.dto.CardAccountInfo;
import com.javainuse.dto.EmployeeInfo;
@RestController
@RequestMapping(value="/v1/consumer")
public class ConsumerController {
	
	@PostMapping(value="/employeeinfo")
	public ResponseEntity<EmployeeInfo> getEmployeeInfo(@RequestBody CardAccountInfo cardAccountInfo, @RequestHeader Long personId){
		
		EmployeeInfo employeeInfo= serviceImpl.getEmployeeInfo(cardAccountInfo, personId);
		
		return new ResponseEntity<EmployeeInfo>();
	}
	
}