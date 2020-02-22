package com.gomezrondon.guestbookfront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.hateoas.config.EnableHypermediaSupport;

@SpringBootApplication
// Enable consumption of HATEOS payloads
@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
// Enable Feign Clients
@EnableFeignClients
public class GuestbookFrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuestbookFrontApplication.class, args);
	}

}
