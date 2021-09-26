package com.alemu.codex.dog.repositarty;


import com.alemu.codex.dog.business.Dog;
import com.fasterxml.jackson.core.JsonParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
@Component
public class DogRepositary {
  Map<String, Dog> dogData=new HashMap();

  private void readJson(){
    JSONParser jsonParser = new JSONParser();
    try(FileReader reader= new FileReader("apidata")) {
      Object object = jsonParser.parse(reader);

      JSONArray breeds = (JSONArray) object;
      breeds.forEach(b->parseBreed(JSONObject)b);

    }
    catch (Exception e){
     e.printStackTrace();
    }


  }

  private static void parseBreed(JSONObject breed){
    //JSONObject breed= (JSONObject) breed.get()
    //TODO convert json to map.
  }
}
