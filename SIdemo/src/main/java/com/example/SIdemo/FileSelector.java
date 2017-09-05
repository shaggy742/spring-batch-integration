package com.example.SIdemo;

import java.io.File;

import org.springframework.integration.core.MessageSelector;
import org.springframework.messaging.Message;

public class FileSelector implements MessageSelector {

	@Override
	public boolean accept(Message<?> message) {
		if(message.getPayload() instanceof File
				&& ((File) message.getPayload()).getName().startsWith("Msg")){
			return true;
		}
		return false;
	}

}
