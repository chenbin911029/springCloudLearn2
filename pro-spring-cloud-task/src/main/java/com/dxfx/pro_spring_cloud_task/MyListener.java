package com.dxfx.pro_spring_cloud_task;

import org.springframework.cloud.task.listener.annotation.AfterTask;
import org.springframework.cloud.task.listener.annotation.BeforeTask;
import org.springframework.cloud.task.listener.annotation.FailedTask;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.stereotype.Component;

@Component
public class MyListener {
	
	
	//spark job  
	
	
	@BeforeTask
	public void methodA(TaskExecution taskExecution) {
		System.out.println("methodA======");
	}

	@AfterTask
	public void methodB(TaskExecution taskExecution) {
		
		System.out.println("methodB======");
	}

	@FailedTask
	public void methodC(TaskExecution taskExecution, Throwable throwable) {
		System.out.println("methodC======");
	}
}
