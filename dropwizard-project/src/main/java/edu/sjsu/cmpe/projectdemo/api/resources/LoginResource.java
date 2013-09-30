package edu.sjsu.cmpe.projectdemo.api.resources;

import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Consumes;
import java.net.*;
import edu.sjsu.cmpe.projectdemo.domain.Login;

@Path("/login/")
@Consumes(MediaType.APPLICATION_JSON)
public class LoginResource
{
	public LoginResource()
	{
		
	}
	
	@POST
	public Response verifyLogin(Login login) throws URISyntaxException
	{
		URI uri=new URI("/login/donor/");
		//As of now hard-coding values
		String username="user1";
		String password="1234";
		if(login.getUserName().equals(username) && login.getPassword().equals(password) /*&& usercode==1*/)
		{
			  return Response.seeOther(uri).build();
		}
		else
		{
			return Response.status(401).entity("Username or password is wrong").build();
		}
	}
}