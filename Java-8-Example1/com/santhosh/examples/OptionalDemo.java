package com.santhosh.examples;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		Optional<String> optionalOf = Optional.of("Santhosh");
		System.out.println(optionalOf.get());
		
		Optional<String> optionalOfn = Optional.ofNullable(null);
		System.out.println(optionalOfn.get());
	}

}
