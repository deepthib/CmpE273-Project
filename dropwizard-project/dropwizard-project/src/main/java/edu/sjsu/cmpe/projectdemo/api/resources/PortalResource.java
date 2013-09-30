package edu.sjsu.cmpe.projectdemo.api.resources;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.joda.time.DateTime;

import com.yammer.metrics.annotation.Timed;

import edu.sjsu.cmpe.projectdemo.domain.AllDonors;
import edu.sjsu.cmpe.projectdemo.domain.Donor;
import edu.sjsu.cmpe.projectdemo.dto.DonorDto;


@Path("/v1/books")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class PortalResource {

	public PortalResource (){
		
	}
	
	public int getDonorIndex (String userName){
	
		int donorIndex = 999;
		
		for (int i = 0; i<AllDonors.allDonors.size(); i++){
			if (userName!= AllDonors.allDonors.get(i).getDonorLogin().getUserName()){
				continue;
			}
			else{
				donorIndex = i;
				break;
			}
		}
		
		return donorIndex;
	}				
	
		
	
	
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/")
    @Timed(name="register-donor")
    
    public Response registerNewDonor (@Valid Donor donorInfo){
    	
    	String donorName = donorInfo.getDonorName();
    	DateTime dateOfBirth = donorInfo.getDateOfBirth();
    	String bloodGroup = donorInfo.getBloodGroup();
    	String address = donorInfo.getAddress();
    	long phoneNumber = donorInfo.getPhoneNumber();
    	String location = donorInfo.getLocation();
    	String emailID = donorInfo.getEmailID();
    	
    	Donor donor = new Donor();
    	
    	donor.setAddress(address);
    	donor.setBloodGroup(bloodGroup);
    	donor.setDateOfBirth(dateOfBirth);
    	donor.setDonorName(donorName);
    	donor.setEmailID(emailID);
    	donor.setLocation(location);
    	donor.setPhoneNumber(phoneNumber);
    	
    	DonorDto donorResponse = new DonorDto (donor);
    	
    	return Response.status(201).entity(donorResponse).build();
    	
    }
    
    @PUT
    @Path ("/{userName}")
    @Timed (name = "change-password")
    
    public Response changeDonorPassword (@PathParam ("userName") String userName, @QueryParam ("password") String password){
		
    	int donorIndex = getDonorIndex (userName);
    	Donor donor = AllDonors.allDonors.get(donorIndex);
    	donor.updatePassword (password);
    	
    	DonorDto donorResponse = new DonorDto (donor);
    	
    	return Response.status(200).entity(donorResponse).build();
    	
    }
}
