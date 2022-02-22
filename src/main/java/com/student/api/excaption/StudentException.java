package com.student.api.excaption;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class StudentException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String resourcename;
	private String fieldname;
	private Object  fieldvalue;
	public StudentException(String resourcename, String fieldname, Object fieldvalue) {
		super();
		this.resourcename = resourcename;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}
	
	public String getResourceName() {
		
		return resourcename;
	}
	
public String getFieldName() {
		
		return fieldname;
	}
public Object getFieldValue() {
	
	return fieldvalue;
}
}
