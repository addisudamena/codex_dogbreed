package com.alemu.codex.dog.repositarty;


import com.alemu.codex.dog.business.Breed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface BreedRepositary extends CrudRepository<Breed,Integer> {


}
