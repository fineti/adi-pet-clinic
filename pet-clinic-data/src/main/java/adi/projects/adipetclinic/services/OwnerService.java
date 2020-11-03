package adi.projects.adipetclinic.services;

import adi.projects.adipetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
