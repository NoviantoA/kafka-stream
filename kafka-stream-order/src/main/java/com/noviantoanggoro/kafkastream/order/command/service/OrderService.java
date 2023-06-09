package com.noviantoanggoro.kafkastream.order.command.service;

import com.noviantoanggoro.kafkastream.order.api.request.OrderRequest;
import com.noviantoanggoro.kafkastream.order.command.action.OrderAction;
import com.noviantoanggoro.kafkastream.order.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

	@Autowired
	private OrderAction action;

	public String saveOrder(OrderRequest request) {
		// 1. convert OrderRequest to Order
		Order order = action.convertToOrder(request);

		// 2. save Order to database
		action.saveToDatabase(order);

		// 3. flatten the item & order as kafka message, and publish
		order.getItems().forEach(action::publishToKafka);

		// 4. return order number (auto generated)
		return order.getOrderNumber();
	}

}
