package com.apache.flink;

import java.util.Arrays;
import java.util.Collection;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;

public class FilterOperation {

	public static void main(String[] args) throws Exception {
		ExecutionEnvironment environment = ExecutionEnvironment.createLocalEnvironment();

		DataSet<Integer> dataSet = environment.fromCollection(data());
		
		dataSet.filter(new DataFilter());
		
		dataSet.print();
		
		//environment.execute();
	}

	private static Collection<Integer> data() {
		return Arrays.asList(10, 20, 30, 40, 50, 52, 50, 234, 23, 12, 77, 89, 100);
	}

}
