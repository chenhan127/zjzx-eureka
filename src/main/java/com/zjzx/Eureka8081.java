package com.zjzx;

import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
	@SpringBootApplication
	@EnableEurekaServer
	public class Eureka8081 {
		public static void main(String[] args) {
			SpringApplication.run(Eureka8081.class, args);
		}
	}
	
	

	//public class ZjzxBootControllerApplication extends SpringBootServletInitializer{
//		@Override
//		protected SpringApplicationBuilder configure(
//				SpringApplicationBuilder builder) {/
//			// TODO Auto-generated method stub
//			return builder.sources(ZjzxBootControllerApplication.class);
//		}
//		public static void main(String[] args) {
//			SpringApplication.run(ZjzxBootControllerApplication.class, args);
//		}
	//}

