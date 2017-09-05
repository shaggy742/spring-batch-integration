package com.example.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class StringFieldSetMapper implements FieldSetMapper<SimpleMessage> {

	@Override
	public SimpleMessage mapFieldSet(FieldSet fieldSet) throws BindException {

		final SimpleMessage msg = new SimpleMessage();
		msg.setMessage(fieldSet.readString(0));
		return msg;
	}
}