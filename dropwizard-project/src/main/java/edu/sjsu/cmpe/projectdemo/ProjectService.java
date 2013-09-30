package edu.sjsu.cmpe.projectdemo;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

<<<<<<< HEAD
import edu.sjsu.cmpe.projectdemo.api.resources.*;
=======
import edu.sjsu.cmpe.projectdemo.api.resources.PortalResource;
>>>>>>> ba43f4bedbe31adfd55f9efe660d796254bbe790
import edu.sjsu.cmpe.projectdemo.config.ProjectServiceConfiguration;

public class ProjectService extends Service <ProjectServiceConfiguration>{

	public static void main (String[] args) throws Exception {
		new ProjectService().run(args);
	}
	
	@Override
	public void initialize(Bootstrap<ProjectServiceConfiguration> bootstrap) {
		bootstrap.setName("project-service");
		
	}

	@Override
	public void run(ProjectServiceConfiguration configuration,
			Environment environment) throws Exception {

<<<<<<< HEAD
		environment.addResource(LoginResource.class);
=======
>>>>>>> ba43f4bedbe31adfd55f9efe660d796254bbe790
		environment.addResource(PortalResource.class);
		
	}
	
		
}