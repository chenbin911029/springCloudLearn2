package com.dxfx.pro_stream_rabbit_processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.Transformer;

@SpringBootApplication
@EnableBinding(Processor.class)
public class SpringStreamRabbitProcessor {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringStreamRabbitProcessor.class, args);
	}

	
	 @Transformer(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
	  public Object transform(String message) {
		 System.out.println(message);
	    return message.toUpperCase();
	  }
}
