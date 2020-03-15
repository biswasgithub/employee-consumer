package com.javainuse.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.javainuse.dto.CardAccountInfo;
import com.javainuse.dto.EmployeeInfo;
import com.javainuse.feign.ProducerFeignProxy;

public class ConsumerServiceImpl {

	@Autowired
	ProducerFeignProxy producerFeignProxy;

	public EmployeeInfo getEmployeeInfo(CardAccountInfo cardAccountInfo, Long personId) {

		EmployeeInfo employeeInfo = producerFeignProxy.produceEmployeeDetails(cardAccountInfo, personId).getBody();
		return employeeInfo;
	}
}
