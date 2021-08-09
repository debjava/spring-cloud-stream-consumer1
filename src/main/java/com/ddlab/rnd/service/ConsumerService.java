package com.ddlab.rnd.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import com.ddlab.rnd.entity.Employee;

@EnableBinding(Sink.class)
public class ConsumerService {

	@StreamListener("input")
	public void consumeMessage(Employee emp) {
		System.out.println("Consume payload : " + emp);
		System.out.println("Emp ID: "+emp.getId());
		System.out.println("Emp Name: "+emp.getName());
	}

}
