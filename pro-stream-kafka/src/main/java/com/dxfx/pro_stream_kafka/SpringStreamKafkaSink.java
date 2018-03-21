package com.dxfx.pro_stream_kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

//@SpringBootApplication
@EnableBinding(MySink.class)
public class SpringStreamKafkaSink {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringStreamKafkaSink.class, args);
	}

	
	@StreamListener(MySink.INPUT)
	  public void handle(String msg) {
		System.out.println(msg);
	  }
}
