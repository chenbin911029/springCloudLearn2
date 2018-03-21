package com.dxfx.pro_spring_cloud_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@SpringBootApplication
@EnableTask
public class SpringCloudTask {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTask.class, args);
	}

}
