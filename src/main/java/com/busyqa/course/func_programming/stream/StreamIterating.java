package com.busyqa.course.func_programming.stream;

import java.util.stream.*;

public class StreamIterating {
	public static void main(String[] args) {
		Stream.iterate(1, element -> element + 1)
		.filter(element -> element % 5 == 0)
		.limit(5)
		.forEach(System.out::println);
	}
}
