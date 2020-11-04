package adi.projects.adipetclinic.bootstrap;

import adi.projects.adipetclinic.model.Owner;
import adi.projects.adipetclinic.model.Vet;
import adi.projects.adipetclinic.services.OwnerService;
import adi.projects.adipetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;

        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("John");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Michael2");
        owner2.setLastName("John2");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Michael3");
        vet1.setLastName("John3");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Michael4");
        vet2.setLastName("John4");

        vetService.save(vet2);
    }
}
