package ibm.ms.models;



import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
//@Table(name="customer")
public class Customer extends PanacheEntityBase {
    private static final long serialVersionUID = 1L;
    
    

	//It denotes that this is primary key
    @Id
  	
   
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cust_id")
	@SequenceGenerator(sequenceName="`itemId_seq`",allocationSize = 1, name = "cust_id")
    @Column(name="`cust_id`")
	private Long id;
	
	@Column(name="`firstname`")
	private String firstname ;
	
	@Column(name="`lastname`")
	private String lastname  ;
	
	@Column(name="`email`") 	
	private String email;
	
	@Column(name="`phone_no`") 	
	private String phone_no;
	
	@Column(name="`dob`") 	
	private Date dob;
	
	/*Constructors*/
	public Customer() {

	}

	public Customer(Long id, String firstname,String lastname,String email,String phone_no,Date dob ) {

		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email=email;
		this.phone_no=phone_no;
		this.dob=dob;
			}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	 public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getPhone_no() {
			return phone_no;
		}

		public void setPhone_no(String phone_no) {
			this.phone_no = phone_no;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}
	 // entity methods
    public static Customer findByName(String name) {
        return find("firstname", name).firstResult();
    }
    
    public static void deleteCustomer(String name) {
        delete("firstname", name);
    }
    
}
