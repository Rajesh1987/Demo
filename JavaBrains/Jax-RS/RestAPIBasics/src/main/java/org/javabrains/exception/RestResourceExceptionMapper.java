package org.javabrains.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class RestResourceExceptionMapper implements ExceptionMapper<Exception> {

	@Override
	public Response toResponse(Exception e) {
		
		System.out.println("in exception mapper to response method");
		
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorMessage(e.getMessage());
		errorResponse.setErrorCode("400");
		errorResponse.setStatus("ERROR");
		
		return Response.status(Status.BAD_REQUEST)
						.entity(errorResponse)
							.build();
	}

}
