package com.twitch.sdk.twitchSDK;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TwitchSdkApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(TwitchSdkApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) 
	{
		return args -> 
		{
		};
	}	
}