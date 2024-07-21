package Training1;

public class Employee {
	//employee name, id, designation,email
    private String name, id, designation, email; 
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//override
	public String toString() {
		return "Watch [name= " + name + " id= " + id + " designation= " + designation + "email= " + email + "]";
	}
}
