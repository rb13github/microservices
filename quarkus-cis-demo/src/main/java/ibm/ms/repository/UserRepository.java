package ibm.ms.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.core.Response;


import ibm.ms.models.User;


@ApplicationScoped
@Transactional(REQUIRED)
public class UserRepository {

//	 @Transactional(SUPPORTS) 
//	public List<User> findAllCust() {
//		return User.findAll().list();
//	}
//
//	 
//	public User findByName(String name) {
//		return User.find("firstname", name).firstResult();
//	}
//	
//	public Response save(User user) {
//		user.persist();
//		return Response.status(201).build();
//	}
//	 public User findById(int id) {
//			return User.find("cust_id", id).firstResult();
//		}
//
//	 //TODO:change to id based
//	public Response delete(Long id) {		
//		 User user = User.findById(id);
//		user.delete();
//		return Response.status(201).build();
//	}
//	
//		
//    public Response update(int id, User user) {
//       
//      
//        User localuser=findById(id) ;
//        localuser.setEmail(user.getEmail());
//        localuser.setFirstname(user.ge());
//        localuser.setLastname(user.getLastname());
//        localuser.setPhone_no(user.getPhone_no());
//        localuser.setLastname(user.getLastname());
//        localuser.setDob(user.getDob());
//    	
//        localuser.persist();
//        return Response.status(201).build();
//    }



}