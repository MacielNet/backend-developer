package net.superbid.backenddeveloper.resources.exceptions;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import net.superbid.backenddeveloper.services.exceptions.ObjectNotFoundException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e, HttpServletRequest request) {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), timestamp);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}
