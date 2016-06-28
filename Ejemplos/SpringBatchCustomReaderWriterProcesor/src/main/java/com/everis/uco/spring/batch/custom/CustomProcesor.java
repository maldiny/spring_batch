package com.everis.uco.spring.batch.custom;

import org.springframework.batch.item.ItemProcessor;

public class CustomProcesor implements ItemProcessor<MyObject, MyObject> {

	@Override
	public MyObject process(MyObject arg0) throws Exception {
		// TODO: Process business logic. In this case toUpperCase each element.
		
		arg0.setId(arg0.getId().toUpperCase());
		
		arg0.setName(arg0.getName().toUpperCase());
		
		return arg0;
	}

}
