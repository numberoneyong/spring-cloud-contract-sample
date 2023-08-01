package io.beinspired.springcloudcontractsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringCloudContractSampleApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringCloudContractSampleApplication::main).with(TestSpringCloudContractSampleApplication.class).run(args);
	}

}
