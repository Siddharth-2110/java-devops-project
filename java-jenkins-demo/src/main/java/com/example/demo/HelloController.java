package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class HelloController {

	    private static final AtomicInteger DEPLOY_COUNTER = new AtomicInteger(1);
	        private static final int CURRENT_DEPLOYMENT = DEPLOY_COUNTER.getAndIncrement();

		    private static final ZoneId IST_ZONE = ZoneId.of("Asia/Kolkata");
		        private static final DateTimeFormatter FORMATTER =
				            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

			    @GetMapping("/")
			        public String hello() {
					        String currentTime = ZonedDateTime.now(IST_ZONE).format(FORMATTER);

						        return "My first deployment using CI-CD Pipeline! "
								                + "Deployment #" + CURRENT_DEPLOYMENT
										                + " | Time: " + currentTime
												                + " | This is my application 1 final built with Docker Compose | May 2026";
							    }
}
