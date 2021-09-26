package com.alemu.codex.dog.service;

import com.alemu.codex.dog.repositarty.DogRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogService {
    @Autowired
    DogRepositary dogRepository;

    public List<String > getAllBreed(){
        return dogRepository.getAlll();
    }
}
