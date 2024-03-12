package cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n02.Repository;

import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n02.Model.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FruitRepository extends JpaRepository <Fruit, Integer> {

    Optional<Fruit> findByNameIgnoreCase(String name);
}
