package com.java.codingpractise.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

// How do you handle null values in streams
//- Streams don’t work well with null values — we should filter them out.
//- Use `Objects::nonNull` to clean the list before processing.
//- If data might be `null`, wrap it using `Optional.ofNullable()` to safely transform or check it.

public class NullVaildationInStream {

	public static void main(String[] args) {
		
		//- Streams don’t work well with null values — we should filter them out.
		//- Use `Objects::nonNull` to clean the list before processing.

		List<String> names = Arrays.asList("Monisha", null, "Priya");
		List<String> result = names.stream().filter(Objects::nonNull).map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("result : "+result);
		
		//- If data might be `null`, wrap it using `Optional.ofNullable()` to safely transform or check it.
		List<String> nameList = null;
		List<String> results = Optional.ofNullable(nameList)
				.orElseGet(Collections::emptyList)
				.stream()
				.filter(Objects::nonNull)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println("results : "+results);
		
		// Case 3: Individual nullable value (not collection)
		String nullValue = null;
		String resultValue = Optional.ofNullable(nullValue)
				.map(String::toUpperCase) // Only executed if not null
				.orElse("UNKNOWN"); // Default value if null
		System.out.println("resultValue : "+resultValue); // Output: UNKNOWN
		

	}

}
