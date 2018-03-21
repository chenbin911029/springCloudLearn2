package com.dxfx.pro_spring_cloud_task;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyTask implements ApplicationRunner ,Ordered{

	@Override
	public void run(ApplicationArguments arg0) throws Exception {

		System.out.println("is ApplicationRunner=========");
	}

	@Override
	public int getOrder() {
		return 1;
	}

}
