package com.ecommerce.cahira;

import com.stripe.Stripe;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class EcommerceApplication  {

	@PostConstruct
	public void setup(){
		Stripe.apiKey="sk_test_51NSUPTGVBdkagBrA6Z2sMtdoBWltcu0sOBWWFp7d25UL8jRFYT58bFewAxJ6LEDS7HDfG6yw9J1VOPFTg3lTqL7p00fyVpJbv4 ";
	}

	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
