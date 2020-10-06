package ibm.ms.repository;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;
import javax.transaction.Transactional;


import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;


import ibm.ms.models.Employee;

@ApplicationScoped
@Transactional(REQUIRED)
public class EmployeeRepository {

	 @Transactional(SUPPORTS) 
	public List<Employee> findAll() {
		return Employee.findAll().list();
	}

	public Employee findByName(String name) {
		return Employee.find("name", name).firstResult();
	}
	public Employee findById(String id) {
		return Employee.find("id", id).firstResult();
	}
	public Response save(Employee employee) {
		employee.persist();
		return Response.status(201).build();
	}
	

    public Response update(String id, Employee employee) {
    	//Employee.persist(employee);
    	Employee emp=findById(id) ;
    	emp.setEmail(employee.getEmail());
    	emp.setAddress(employee.getAddress());
    	emp.setName(employee.getName());
    	
    	emp.persist();
        return Response.status(201).build();
    }

//	public Response delete(String name) {		
//		Employee employee = Employee.findByName(name);
//		employee.delete();
//		return Response.status(201).build();
//	}
    
	public Response delete(String id) {		
		Employee employee = Employee.findById(id);
		employee.delete();
		return Response.status(201).build();
	}
	


}