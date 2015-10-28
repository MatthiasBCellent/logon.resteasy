package de.cellent.test.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * http://docs.jboss.org/resteasy/docs/2.2.1.GA/userguide/html/Installation_Configuration.html
 * 
 * Invocation: http://localhost:8080/resteasy/rest/messageService/the_parameter_here
 * 
 * @author mbohnen
 *
 */
@Path("/messageService")
public class HelloWorldService {
	
	@GET
	@Path("/{param}")
	public String sayHello(@PathParam("param") String msg) {
		return this.getClass().getSimpleName() + " responding: " + msg.toUpperCase();
	}

}
