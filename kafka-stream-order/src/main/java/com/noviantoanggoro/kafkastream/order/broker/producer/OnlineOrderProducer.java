package com.noviantoanggoro.kafkastream.order.broker.producer;

import com.noviantoanggoro.kafkastream.order.broker.message.OnlineOrderMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OnlineOrderProducer {

	@Autowired
	private KafkaTemplate<String, OnlineOrderMessage> kafkaTemplate;

	public void publish(OnlineOrderMessage message) {
		kafkaTemplate.send("t-commodity-online-order", message.getOnlineOrderNumber(), message);
	}

}
