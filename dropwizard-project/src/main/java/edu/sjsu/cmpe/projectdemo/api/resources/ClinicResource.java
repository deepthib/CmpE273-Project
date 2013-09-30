package edu.sjsu.cmpe.projectdemo.api.resources;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.Produces;

import edu.sjsu.cmpe.projectdemo.domain.AllClinics;
import edu.sjsu.cmpe.projectdemo.domain.Clinic;

import java.util.ArrayList;


@Path("/login/donor/clinics")
@Produces(MediaType.APPLICATION_JSON)
public class ClinicResource
{
	AllClinics clinics;
	public ClinicResource()
	{
		clinics=new AllClinics();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getListOfClinics()
	{
		ArrayList<Clinic> clinicList=clinics.getClinics();
		return Response.status(200).entity(clinicList).build();
	}
}