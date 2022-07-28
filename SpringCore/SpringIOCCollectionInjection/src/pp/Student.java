package pp;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int sid;
	private String name;
	List<String>  emails;
	Set<String>  phone;
	Map<String,String> refs;
	
	Address  address;
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Student(int sid, String name, List<String> emails, Set<String> phone) {
		super();
		this.sid = sid;
		this.name = name;
		this.emails = emails;
		this.phone = phone;
	}

	public Student() {
		super();
	}

	public Map<String, String> getRefs() {
		return refs;
	}

	public void setRefs(Map<String, String> refs) {
		this.refs = refs;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", emails=" + emails + ", phone=" + phone + ", refs=" + refs
				+ ", address=" + address + "]";
	}




	
	

}
