package emiione.springframework.petclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {
	
	// Instance variables (Properties)
	private PetType petType;
	private Owner owner;
	private LocalDate birthday;
	
	
	// Getters and Setters
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	

}
