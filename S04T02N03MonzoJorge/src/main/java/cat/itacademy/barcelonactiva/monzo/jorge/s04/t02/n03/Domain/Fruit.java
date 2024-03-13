package cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n03.Domain;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "fruits")
public class Fruit {

    @Id
    private ObjectId id;

    private String name;
    private Integer weightKG;

    public Fruit(ObjectId id, String name, int weightKG){
        this.id = id;
        this.name = name;
        this.weightKG = weightKG;
    }

    public ObjectId getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(Integer weightKG) {
        this.weightKG = weightKG;
    }

    @Override
    public String toString() {
        return "Fruta" + " con identificador " + id +", nombre" + name +", y peso en Kgs" + weightKG;
    }
}