package emiione.springframework.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import emiione.springframework.petclinic.model.Owner;
import emiione.springframework.petclinic.model.Vet;
import emiione.springframework.petclinic.services.OwnerService;
import emiione.springframework.petclinic.services.VetService;


@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	
	// Constructor
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		
		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Michael");
		owner1.setLastName("Magneto");
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setId(2L);
		owner2.setFirstName("Cristina");
		owner2.setLastName("Ionescu");
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners...");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Joshua");
		vet1.setLastName("Martin");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Paolo");
		vet2.setLastName("Martinez");
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
		
	}

}
