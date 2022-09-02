package com.myproj.demo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class userservice {

	public List<users> loadusers(){
	List<users> l = new ArrayList<users>();
	l.add (new users());
	
	return l;
	}
	private List<users> listofusers=loadusers();
	
	public List<users> getallusers(){
		return listofusers;
	}
	
	public String addusers(users user){
		listofusers.add(user);
		return "user added";
	}
	
	public String updateUsers(users user) {
		boolean resourceFound=false;
		for(users currentuser: listofusers) {
			if(currentuser.getId() == user.getId()) {
				resourceFound=true;
				currentuser.setName(user.getName());
				currentuser.setAddress(user.getAddress());
				currentuser.setEmail(user.getEmail());
				currentuser.setPhoneNo(user.getPhoneNo());
			}
		}
		if(!resourceFound) {
			listofusers.add(user);
			return "User added successfully";

		}
		return "User updated successfully";
	
	}
}

 