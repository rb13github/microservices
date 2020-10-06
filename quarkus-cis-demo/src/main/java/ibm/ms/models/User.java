package ibm.ms.models;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
@Entity
//@Data
@Table(name="User")
public class User {

    @Id
    @GeneratedValue
    private BigInteger userid;
    private String name;
    public BigInteger getUserid() {
		return userid;
	}

	public void setUserid(BigInteger userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	private String email;

    //@Getter(AccessLevel.NONE)
  //  @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Address> addresses = new ArrayList<>();

    public void addAddress(Address address){
        address.setUser(this);
        addresses.add(address);
    }
    
    
    
}
