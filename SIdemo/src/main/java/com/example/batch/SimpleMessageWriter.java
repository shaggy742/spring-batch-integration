package com.example.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class SimpleMessageWriter implements ItemWriter<SimpleMessage> {

	//private static final Logger LOGGER = Logger.getLogger(PaymentWriter.class);

	public SimpleMessageWriter() {
	}

	@Override
	public void write(List<? extends SimpleMessage> payments) throws Exception {
		for (SimpleMessage payment : payments) {
			System.out.println("HSAHAHAHAHAHA" + payment+ " ------------");
		}
	}
}