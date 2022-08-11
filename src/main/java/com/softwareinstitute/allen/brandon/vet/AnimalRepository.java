package com.softwareinstitute.allen.brandon.vet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnimalRepository {

    private List<Animal> animalList = new ArrayList<>();

    public List<Animal> getAll() {
        return animalList;
    }

    public void add() {
        animalList.clear();
        this.animalList.add(new Cat(true, 4, "Nala", "Black"));
        this.animalList.add(new Cat(true, 3, "Bruce", "Black and White"));
        this.animalList.add(new Cat(true, 2, "Tibbles", "Multicoloured"));
        this.animalList.add(new Cat(true, 1, "Tom", "Ginger"));
    }

    public String toStringJSON(AnimalRepository repo){
        return new Gson().toJson(repo.getAll());
    }

    /*public HashMap JSONtoArray(String str) throws JsonProcessingException {
        return new ObjectMapper().readValue(str, HashMap.class);
    }*/
}