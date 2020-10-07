package com.domain.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	@Autowired
	Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguration reteriveLimitsFromConfigurations() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());

	}
}
