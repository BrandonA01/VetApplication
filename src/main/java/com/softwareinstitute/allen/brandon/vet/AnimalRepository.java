package com.softwareinstitute.allen.brandon.vet;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {

    private List<Cat> animalList = new ArrayList<>();
    private List<Cat> searchanimalList = new ArrayList<>();

    public List<Cat> getAll() {
        return animalList;
    }

    public void add() {
        this.animalList.add(new Cat(true, 4, "Nala", "Black"));
        this.animalList.add(new Cat(true, 3, "Bruce", "Black and White"));
        this.animalList.add(new Cat(true, 2, "Tibbles", "Multicoloured"));
        this.animalList.add(new Cat(true, 1, "Tom", "Ginger"));
    }

    public void addAnimal(Cat cat) {
        this.animalList.add(cat);
    }

    public List<Cat> searchAnimalByName(String name){
        for(int i = 0; i<animalList.size(); i++){
            if(animalList.get(i).getName().equals(name)){
                searchanimalList.add(animalList.get(i));
            }
        }
        return searchanimalList;
    }

    public String toStringJSON(List li){
        return new Gson().toJson(li);
    }


    /*public HashMap JSONtoArray(String str) throws JsonProcessingException {
        return new ObjectMapper().readValue(str, HashMap.class);
    }*/
}