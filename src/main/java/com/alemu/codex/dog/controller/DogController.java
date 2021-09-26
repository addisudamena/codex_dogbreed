package com.alemu.codex.dog.controller;

import com.alemu.codex.dog.business.Dog;
import com.alemu.codex.dog.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/breed")
public class DogController {
    @Autowired
    public DogService dogService;

    @GetMapping("/list/all")
    public List<Dog> aldBreed(){
        return dogService.getAllBreed();
    }
}
