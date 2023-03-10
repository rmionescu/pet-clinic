package emiione.springframework.petclinic.services;

import java.util.Set;

import emiione.springframework.petclinic.model.Owner;

public interface OwnerService {

	Owner findByLastName(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();

}
