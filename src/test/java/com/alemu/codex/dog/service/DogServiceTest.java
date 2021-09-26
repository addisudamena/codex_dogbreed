package com.alemu.codex.dog.service;

import com.alemu.codex.dog.repositarty.DogRepositary;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class DogServiceTest {

    @Mock
    private DogRepositary dogRepository;
    private DogService dogService;

    @Test
    void ShouldGetAllBreed() {
        //given
        //TODO setup what to be return by repository

        when(dogRepository.getAll()).return("to be return by repository");

        //when
        List<Dog> allBreeds=dogService.getAllBreed();

        //then
        assertThat(allBreeds).equals("to be returnd by repository")

    }
}