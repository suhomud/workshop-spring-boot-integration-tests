package io.brahman.store.rest;

import io.brahman.store.domain.ErrorInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@ResponseStatus(HttpStatus.BAD_GATEWAY)
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public ErrorInfo handleNoRecipientsException(RuntimeException ex, WebRequest request) {
		log.info("ResourceNotFoundException handler:" + ex.getMessage());

		return new ErrorInfo(ex, "Please, add recipient before sending the message");
	}

}
