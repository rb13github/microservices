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

import ibm.ms.models.CustomerMongoDB;
import ibm.ms.repository.CustomerMongoDBRepository;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CustomerResource {

//
//	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerResource.class);
//
//	@Inject
//	CustomerRepository customerRepository;
//
//	@GET
//	@Path("/search")
//	public List<Customer> findAllUser() {
//		  LOGGER.info("All cis-customer search");
//		return customerRepository.findAll();
//	}
//
//	@GET
//	@Path("/search/{name}")
//	public Customer findCustomer(@PathParam("name") String name) {
//		  LOGGER.info("Specific cis-customer search");
//		return customerRepository.findByName(name);
//	}
//
//	@POST
//	@Path("/save")
//	public Response saveCustomer(@Valid Customer patient) {
//		  LOGGER.info("Create cis-customer");
//		return customerRepository.save(patient);
//	}
//
//	@PUT
//	@Path("/update/{name}")
//	public Response updateCustomer(@PathParam("name") String name, @Valid Customer patient) {
//		  LOGGER.info("Update cis-customer");
//		return customerRepository.update(name, patient);
//	}
//
//	@DELETE
//	@Path("/delete/{name}")
//	public Response deleteCustomer(@PathParam("name") String name) {
//		  LOGGER.info("Delete cis-customer");
//		return customerRepository.delete(name);
//	}
//	
//	   	

}