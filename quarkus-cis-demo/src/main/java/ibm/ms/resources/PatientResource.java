package ibm.ms.resources;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ibm.ms.models.Patient;
import ibm.ms.repository.PatientRepository;

@Path("/patient")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PatientResource {


//	private static final Logger LOGGER = LoggerFactory.getLogger(PatientResource.class);
//
//	@Inject
//	PatientRepository patientRepository;
//
//	@GET
//	@Path("/search")
//	public List<Patient> findAllUser() {
//		  LOGGER.info("All user search");
//		return patientRepository.findAll();
//	}
//
//	@GET
//	@Path("/search/{name}")
//	public Patient findPatient(@PathParam("name") String name) {
//		  LOGGER.info("Specific Patient search");
//		return patientRepository.findByName(name);
//	}
//
//	@POST
//	@Path("/save")
//	public Response savePatient(@Valid Patient patient) {
//		  LOGGER.info("Create Patient");
//		return patientRepository.save(patient);
//	}
//
//	@PUT
//	@Path("/update/{name}")
//	public Response updatePatient(@PathParam("name") String name, @Valid Patient patient) {
//		  LOGGER.info("Update user");
//		return patientRepository.update(name, patient);
//	}
//
//	@DELETE
//	@Path("/delete/{name}")
//	public Response deletePatient(@PathParam("name") String name) {
//		  LOGGER.info("Delete user");
//		return patientRepository.delete(name);
//	}
//	
//	   	

}