package com.dxfx.pro_spring_cloud_task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MySimpleTask implements CommandLineRunner ,Ordered{

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("hello world task");
	}
	
	
	@Bean
	public CommandLineRunner commandLineRunner() {
		
		return new CommandLineRunner() {
			
			@Override
			public void run(String... arg0) throws Exception {
				throw new RuntimeException();
//				System.out.println("Executed at :" + 
//					      new SimpleDateFormat().format(new Date()));
			}
		};
	}


	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
}
