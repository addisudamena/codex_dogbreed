package com.alemu.codex.dog.utility;

import com.alemu.codex.dog.business.Breed;
import com.alemu.codex.dog.repositarty.BreedRepositary;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class BreedLoader implements CommandLineRunner {

    @Autowired
    private BreedRepositary breedRepositary;

    @Override
    public void run(String... args) throws Exception {
        Resource resource = new ClassPathResource("apidata.json");
        InputStream inputStream = resource.getInputStream();
        try {
            byte[] bdata = FileCopyUtils.copyToByteArray(inputStream);
            String data = new String(bdata, StandardCharsets.UTF_8);
            loadBreeds(data);


        } catch (IOException e) {
            System.out.println("IOException: "+e);
        }
    }

    private void loadBreeds(String data) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, List<String>> readData=objectMapper.readValue(data , HashMap.class);

        for(String key: readData.keySet()){
            System.out.println("key = "+key+" value = "+readData.get(key));
            Breed temp= new Breed();
            temp.setBreed(key);
            temp.setSub_breed(readData.get(key));

            breedRepositary.save(temp);
            System.out.println(temp.getBreed()+" added.");

        }


    }
}
