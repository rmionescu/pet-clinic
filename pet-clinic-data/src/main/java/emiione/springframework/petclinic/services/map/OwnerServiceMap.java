package emiione.springframework.petclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import emiione.springframework.petclinic.model.Owner;
import emiione.springframework.petclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	public Owner findByLastName(String lastName) {
		return null;
	}

}
