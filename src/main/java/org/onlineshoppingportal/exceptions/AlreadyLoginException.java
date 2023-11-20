package org.onlineshoppingportal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import javassist.bytecode.CodeAttribute.RuntimeCopyException;

//these exception is used to display that what exception by throwing own customise the error to avoid the confusion exception like 
//ProductOutOfStockException,AlreadyLoginException,NoOrderFoundException

@ResponseStatus(value=HttpStatus.TEMPORARY_REDIRECT,reason=" User already logged in",code=HttpStatus.TEMPORARY_REDIRECT)
public class AlreadyLoginException extends RuntimeCopyException{

	public AlreadyLoginException() {
		super("Already logged in user tried to access signup/login page");
	}
}
