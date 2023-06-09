package com.noviantoanggoro.kafkastream.order.broker.producer;

import com.noviantoanggoro.kafkastream.order.broker.message.WebLayoutVoteMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class WebLayoutVoteProducer {

	@Autowired
	private KafkaTemplate<String, WebLayoutVoteMessage> kafkaTemplate;

	public void publish(WebLayoutVoteMessage message) {
		kafkaTemplate.send("t-commodity-web-vote-layout", message.getUsername(), message);
	}

}
