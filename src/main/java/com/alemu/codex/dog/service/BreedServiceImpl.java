package com.alemu.codex.dog.service;

import com.alemu.codex.dog.business.Breed;
import com.alemu.codex.dog.repositarty.BreedRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BreedServiceImpl implements BreedService{
    @Autowired
    BreedRepositary breedRepository;

    public List<Breed> getAllBreeds(){
        return (List<Breed>) breedRepository.findAll();
    }
}
