package com.java.gmall.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author jiangli
 * @since 2020/1/13 20:41
 */
@SpringBootApplication
@EnableFeignClients
public class SearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchApplication.class,args);
	}
}
