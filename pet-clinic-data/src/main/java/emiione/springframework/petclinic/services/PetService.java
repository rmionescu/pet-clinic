package emiione.springframework.petclinic.services;

import java.util.Set;

import emiione.springframework.petclinic.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();

}
