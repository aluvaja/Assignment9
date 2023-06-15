package com.wf.summul.impl;

import org.springframework.stereotype.Component;

import com.wf.summul.service.CalculationService;

@Component("MultiplyServiceImpl")
public class MultiplyServiceImpl implements CalculationService {

	@Override
	public Integer calculate(Integer num1, Integer num2) {
		return num1 * num2;
	}

}
