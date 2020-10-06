package ibm.ms.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;

import ibm.ms.models.Customer;
import ibm.ms.models.CustomerMongoDB;

@ApplicationScoped
public class CustomerMongoDBRepository {

	public List<CustomerMongoDB> findAll() {
		return CustomerMongoDB.findAll().list();
	}

	public CustomerMongoDB findByName(String name) {
		return CustomerMongoDB.find("name", name).firstResult();
	}

	public Response save(CustomerMongoDB customer) {
		customer.persist();
		return Response.status(201).build();
	}
	

    public Response update(String name, CustomerMongoDB customer) {
        customer.update();
        return Response.status(201).build();
    }

	public Response delete(String name) {		
		CustomerMongoDB customer = CustomerMongoDB.findByName(name);
		customer.delete();
		return Response.status(201).build();
	}
	
	

}