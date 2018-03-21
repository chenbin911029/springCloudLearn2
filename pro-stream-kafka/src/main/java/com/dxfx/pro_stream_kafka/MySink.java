package com.dxfx.pro_stream_kafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {
	String INPUT = "input_sink_channel";

	@Input(MySink.INPUT)
	SubscribableChannel input();
}
