package cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n01.Model.Domain;

import jakarta.persistence.*;

@Entity
@Table(name="Fruit")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "Kgs", nullable = false, length = 8)
    private Integer weightKG;

    public Integer getId() {
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
