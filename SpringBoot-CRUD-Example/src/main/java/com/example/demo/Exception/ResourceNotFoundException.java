package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resource;
	private String fieldName;
	private Object fieldValue;

	public ResourceNotFoundException(String resource, String fieldName, Object fieldValue) {
		super(String.format("Resource %s not found for %s for the value %s" + resource, fieldName, fieldValue));
		this.resource = resource;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getResource() {
		return resource;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Object getFieldValue() {
		return fieldValue;
	}

}
