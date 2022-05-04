package com.Multiplex.exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException  {
	@Value(value="${data.exception.message1}")
	private String message1;
	
	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity userNotFoundException(UserNotFoundException ex) {
		return new ResponseEntity(message1,HttpStatus.NOT_FOUND);
	}
	

		@Value(value="${data.exception.message2}")
		private String message2;
		@ExceptionHandler(MovieNotFoundException.class)
		public ResponseEntity handleNotFoundException(MovieNotFoundException ex) {
			return new ResponseEntity(message2,HttpStatus.NOT_FOUND);
		}
	
	
}