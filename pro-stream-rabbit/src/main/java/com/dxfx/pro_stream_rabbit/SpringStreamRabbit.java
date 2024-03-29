package com.dxfx.pro_stream_rabbit;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.GenericMessage;

@SpringBootApplication
@EnableBinding(Source.class)
public class SpringStreamRabbit {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringStreamRabbit.class, args);
	}

	
	@Bean
	@InboundChannelAdapter(value=Source.OUTPUT,poller=@Poller(fixedDelay="1000"))
	public MessageSource<String> createMessage(){
		return new MessageSource<String>() {
			@Override
			public Message<String> receive() {
				return new GenericMessage<>("ssssss");
			}
		};
	}
	
}
