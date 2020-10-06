package ibm.ms.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;


import ibm.ms.models.Customer;


@ApplicationScoped
@Transactional(REQUIRED)
public class CustomerRepository {

	 @Transactional(SUPPORTS) 
	public List<Customer> findAllCust() {
		return Customer.findAll().list();
	}

	 
	public Customer findByName(String name) {
		return Customer.find("firstname", name).firstResult();
	}
	
	public Response save(Customer customer) {
		customer.persist();
		return Response.status(201).build();
	}
	 public Customer findById(int id) {
			return Customer.find("cust_id", id).firstResult();
		}

	 //TODO:change to id based
	public Response delete(Long id) {		
		 Customer customer = Customer.findById(id);
		customer.delete();
		return Response.status(201).build();
	}
	
		
    public Response update(int id, Customer customer) {
       
      
        Customer cust=findById(id) ;
        cust.setEmail(customer.getEmail());
        cust.setFirstname(customer.getFirstname());
        cust.setLastname(customer.getLastname());
        cust.setPhone_no(customer.getPhone_no());
        cust.setLastname(customer.getLastname());
        cust.setDob(customer.getDob());
    	
        cust.persist();
        return Response.status(201).build();
    }



}