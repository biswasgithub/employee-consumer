package com.javainuse.feign;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javainuse.dto.CardAccountInfo;
import com.javainuse.dto.EmployeeInfo;

@RequestMapping(value="v1/producer")
public interface ProducerFeignProxy {

	@PostMapping(value = "/employeedetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeInfo> produceEmployeeDetails(@RequestBody CardAccountInfo cardAccountInfo, @RequestHeader Long personId);
}
