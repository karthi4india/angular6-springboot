package com.upnxtblog.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestapiApplication {
	
	@RequestMapping("/api/hello")
	public String hello() {
		return "Hello world! >>> <a href='http://upnxtblog.com' target='_blank'>upnxtblog.com</a>";
	}

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}
}
