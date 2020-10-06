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

import ibm.ms.models.Customer;
import ibm.ms.repository.CustomerRepository;


@Path("/customerv1.0")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class Customer_BasicResource {


	private static final Logger LOGGER = LoggerFactory.getLogger(Customer_BasicResource.class);

	@Inject
	CustomerRepository customer_basicRepository;

	@GET
	@Path("/search")
	public List<Customer> findAllCustomers() {
		  LOGGER.info("All customer_basic search");
		return customer_basicRepository.findAllCust();
		  
	}

//	@GET
//	@Path("/search/{name}")
//	public Employee findEmployee(@PathParam("name") String name) {
//		  LOGGER.info("Specific employee search");
//		return employeeRepository.findByName(name);
//	}
	@GET
	@Path("/search/{id}")
	public Customer findCustomer_Basic(@PathParam("id") String id) {
		  LOGGER.info("Specific customer_basic search by id="+id);
		return customer_basicRepository.findById(Integer.parseInt(id));
	}

	@POST
	@Path("/save")
	public Response saveCustomer_Basic(@Valid Customer customer_basic) {
		  LOGGER.info("Create customer_basic");
		return customer_basicRepository.save(customer_basic);
	}

//	@PUT
//	@Path("/update/{name}")
//	public Response updateEmployee(@PathParam("name") String name, @Valid Employee employee) {
//		  LOGGER.info("Update employee");
//		return employeeRepository.update(name, employee);
//	}

	
	@PUT
	@Path("/update/{id}")
	public Response updateCustomer_Basic(@PathParam("id") String id, @Valid Customer customer_basic) {
		  LOGGER.info("Update customer_basic for the id="+id);
		return customer_basicRepository.update(Integer.parseInt(id), customer_basic);
	}
//	@DELETE
//	@Path("/delete/{name}")
//	public Response deleteEmployee(@PathParam("name") String name) {
//		  LOGGER.info("Delete employee");
//		return employeeRepository.delete(name);
//	}
	
	@DELETE
	@Path("/delete/{id}")
	public Response deleteCustomer_Basic(@PathParam("id") String id) {
		  LOGGER.info("Delete customer_basic");
		return customer_basicRepository.delete(Long.parseLong(id));
	}
	
	   	

}