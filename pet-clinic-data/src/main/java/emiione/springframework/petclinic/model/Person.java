package emiione.springframework.petclinic.model;

public class Person extends BaseEntity {

	// Instance variables (Properties)
	private String firstName;
	private String lastName;
	
	// Getters and Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
