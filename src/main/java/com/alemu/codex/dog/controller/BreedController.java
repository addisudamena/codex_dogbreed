package com.alemu.codex.dog.controller;

import com.alemu.codex.dog.business.Breed;
import com.alemu.codex.dog.service.BreedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/breed")
public class BreedController {
    @Autowired
    public BreedServiceImpl breedService;

    @GetMapping("/list/all")
    public List<Breed> aldBreed(){
        return breedService.getAllBreeds();
    }
}
