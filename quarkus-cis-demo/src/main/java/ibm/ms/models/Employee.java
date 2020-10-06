package ibm.ms.models;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee extends PanacheEntityBase {
    private static final long serialVersionUID = 1L;
    
     //It denotes that this is primary key
    @Id
  	@Column(name="`employeeid`")
	private String id;
	
	@Column(name="`employeename`")
	private String name;
	
	@Column(name="`employeeaddress`")
	private String address;
	
	@Column(name="`employeeemail`") 	
	private String email;
	
	
	/*Constructors*/
	public Employee() {

	}

	public Employee(String id, String name,String address,String email ) {

		this.id = id;
		this.name = name;
		this.address = address;
		this.email=email;
			}

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	 // entity methods
    public static Employee findByName(String name) {
        return find("name", name).firstResult();
    }
    
    public static void deleteCustomer(String name) {
        delete("name", name);
    }
    
}
