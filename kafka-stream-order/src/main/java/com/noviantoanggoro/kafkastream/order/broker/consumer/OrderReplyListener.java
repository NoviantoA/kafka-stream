package com.noviantoanggoro.kafkastream.order.broker.consumer;

import com.noviantoanggoro.kafkastream.order.broker.message.OrderReplyMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderReplyListener {

	private static final Logger LOG = LoggerFactory.getLogger(OrderReplyListener.class);

	@KafkaListener(topics = "t-commodity-order-reply")
	public void listen(OrderReplyMessage message) {
		LOG.info("Reply message received : {}", message);
	}

}
