package com.example.batch;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class StringFieldSetMapper implements FieldSetMapper<SimpleMessage> {

	@Override
	public SimpleMessage mapFieldSet(FieldSet fieldSet) throws BindException {

		final SimpleMessage msg = new SimpleMessage();

		/*payment.setSourceAccountNo(fieldSet.readString("source"));
		payment.setDestinationAccountNo(fieldSet.readString("destination"));
		payment.setAmount(fieldSet.readBigDecimal("amount"));
		payment.setDate(fieldSet.readDate("date"));
*/
		msg.setMessage(fieldSet.readString(0));
		return msg;
	}
}