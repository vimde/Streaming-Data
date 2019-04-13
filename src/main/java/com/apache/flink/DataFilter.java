package com.apache.flink;

import org.apache.flink.api.common.functions.FilterFunction;

public class DataFilter implements FilterFunction<Integer> {

	private static final long serialVersionUID = 1L;

	@Override
	public boolean filter(Integer number) throws Exception {
		return number % 2 == 0;
	}

}
