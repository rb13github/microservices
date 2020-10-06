package ibm.ms.models;
import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;


@MongoEntity(collection = "cis-customer")
public class CustomerMongoDB extends PanacheMongoEntity {

	//@Id //It denotes that this is primary key
	//@Field(value = "_id")  //It maps JSON property with MongoDB Document Field
	private String id;
	private String mobile;
	private String name;

	/*Constructors*/
	public CustomerMongoDB() {

	}

	public CustomerMongoDB(String id, String name, String mobile) {

		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	
	/* Getters and Setters*/
	
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	 // entity methods
    public static CustomerMongoDB findByName(String name) {
        return find("name", name).firstResult();
    }
    
    public static void deleteCustomer(String name) {
        delete("name", name);
    }

}
