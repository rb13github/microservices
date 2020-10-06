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

import ibm.ms.models.Employee;
import ibm.ms.repository.EmployeeRepository;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource {


//	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeResource.class);
//
//	@Inject
//	EmployeeRepository employeeRepository;

//	@GET
//	@Path("/search")
//	public List<Employee> findAllUser() {
//		  LOGGER.info("All employee search");
//		return employeeRepository.findAll();
//	}
//
////	@GET
////	@Path("/search/{name}")
////	public Employee findEmployee(@PathParam("name") String name) {
////		  LOGGER.info("Specific employee search");
////		return employeeRepository.findByName(name);
////	}
//	@GET
//	@Path("/search/{id}")
//	public Employee findEmployee(@PathParam("id") String id) {
//		  LOGGER.info("Specific employee search by id="+id);
//		return employeeRepository.findById(id);
//	}
//
//	@POST
//	@Path("/save")
//	public Response saveEmployee(@Valid Employee employee) {
//		  LOGGER.info("Create employee");
//		return employeeRepository.save(employee);
//	}
//
////	@PUT
////	@Path("/update/{name}")
////	public Response updateEmployee(@PathParam("name") String name, @Valid Employee employee) {
////		  LOGGER.info("Update employee");
////		return employeeRepository.update(name, employee);
////	}
//
//	
//	@PUT
//	@Path("/update/{id}")
//	public Response updateEmployee(@PathParam("id") String id, @Valid Employee employee) {
//		  LOGGER.info("Update employee for the id="+id);
//		return employeeRepository.update(id, employee);
//	}
////	@DELETE
////	@Path("/delete/{name}")
////	public Response deleteEmployee(@PathParam("name") String name) {
////		  LOGGER.info("Delete employee");
////		return employeeRepository.delete(name);
////	}
//	
//	@DELETE
//	@Path("/delete/{id}")
//	public Response deleteEmployee(@PathParam("id") String id) {
//		  LOGGER.info("Delete employee");
//		return employeeRepository.delete(id);
//	}
//	
//	   	

}