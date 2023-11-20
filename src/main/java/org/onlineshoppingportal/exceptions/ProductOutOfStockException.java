package org.onlineshoppingportal.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND,reason=" Product Out of Stock",code=HttpStatus.NOT_FOUND)
public class ProductOutOfStockException extends RuntimeException{

	public ProductOutOfStockException()
	{
		super("Product Out of Stock");
	}
}
