package org.javabrains.resources;

import java.util.List;

import javax.ws.rs.BadRequestException;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.javabrains.exception.ErrorResponse;
import org.javabrains.model.Message;
import org.javabrains.service.MessageService;

@Path("/messages")
@Produces( value = { MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public class MessageResources {
	
	private MessageService service = new MessageService();

	@GET
	public List<Message> getMessage() throws Exception{
		
		int a = 16;
		try {
			if(a > 20) {
				throw new IllegalArgumentException();
			} else if (a == 16) {
				ErrorResponse errorResponse = new ErrorResponse();
				errorResponse.setErrorMessage("Throwing web application exception");
				errorResponse.setErrorCode("PL12345");
				errorResponse.setStatus("ERROR");
				System.out.println("thowing bad request exception");
				 Response response = Response.status(Status.BAD_REQUEST)
												.entity(errorResponse)
													.build();
				throw new BadRequestException(response);
			} else {
				a++;
			}
			
		} catch(IllegalArgumentException illegalArgsExp) {
			throw new IllegalArgumentException("Throwing Illegal args exceptions");
		} 
		List<Message> messagesList = service.getMessagesList();
		return service.getMessagesList();
	}
	
	@POST
	public Response addMessage() {
		System.out.println("in post method");
		List<Message> messagesList = service.getMessagesList();
		return Response.status(Status.CREATED)
						.entity(messagesList)
							.type(MediaType.APPLICATION_JSON)
								.build();
	}
}
