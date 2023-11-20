package org.onlineshoppingportal.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import javassist.bytecode.CodeAttribute.RuntimeCopyException;

 
@ResponseStatus(value=HttpStatus.NOT_FOUND,reason=" No Order Found Exception",code=HttpStatus.NOT_FOUND)
public class NoOrderFoundException extends  RuntimeCopyException{

 

	public NoOrderFoundException() {
		super("NoOrderFoundException");
		// TODO Auto-generated constructor stub
	}


 

}