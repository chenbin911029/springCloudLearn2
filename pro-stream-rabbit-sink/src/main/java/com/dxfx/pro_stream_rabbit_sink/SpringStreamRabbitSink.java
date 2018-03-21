package com.dxfx.pro_stream_rabbit_sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringStreamRabbitSink {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringStreamRabbitSink.class, args);
	}

	
	@StreamListener(Sink.INPUT)
	  public void handle(String msg) {
		System.out.println(msg);
	  }
}
