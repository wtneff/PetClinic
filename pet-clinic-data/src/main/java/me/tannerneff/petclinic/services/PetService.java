package me.tannerneff.petclinic.services;

import me.tannerneff.petclinic.model.Pet;

import java.util.Set;

public interface PetService {


    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
