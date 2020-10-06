package ibm.ms.models;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
	//@Data
	@Table(name="UserAddress")
	public class Address {

	    @Id
	    @GeneratedValue
	    private BigInteger addressId;
	    private String addressLine;
	    private String city;
	    private String zipcode;

	    public String getZipcode() {
			return zipcode;
		}

		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}

		@ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name="UserId")
	    private User user;

		

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
	    
	    
	    

	}

