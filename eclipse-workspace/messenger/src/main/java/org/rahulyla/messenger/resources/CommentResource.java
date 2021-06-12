package org.rahulyla.messenger.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/")
public class CommentResource {
	
	@GET
	public String test() {
		return "hey";
	}
	
	@GET
	@Path("/{commentId}")
	public String test(@PathParam("messageId") long messageId,@PathParam("commentId") long commentId) {
		return "hello";
	}
}
