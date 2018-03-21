package com.dxfx.pro_stream_kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;

//@SpringBootApplication
@EnableBinding(MyProcessor.class)
public class SpringStreamKafkaProcessor {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringStreamKafkaProcessor.class, args);
	}

	
	 @Transformer(inputChannel = MyProcessor.INPUT, outputChannel = MyProcessor.OUTPUT)
	  public Object transform(String message) {
		 System.out.println(message);
	    return message.toUpperCase();
	  }
}
