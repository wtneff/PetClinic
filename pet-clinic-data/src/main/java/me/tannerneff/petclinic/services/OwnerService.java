package me.tannerneff.petclinic.services;

import me.tannerneff.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
