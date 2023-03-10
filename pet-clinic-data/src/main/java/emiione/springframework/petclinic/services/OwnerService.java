package emiione.springframework.petclinic.services;

import emiione.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

}
