package com.dxfx.pro_stream_kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface MyProcessor {
	String OUTPUT = "output_channel";
	
	String INPUT = "input_channel";

	@Output(MyProcessor.OUTPUT)
	MessageChannel output();
	
	@Input(MyProcessor.INPUT)
	SubscribableChannel input();
}
