package cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n01.Model.Repository;

import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n01.Model.Domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FruitRepository extends JpaRepository <Fruit, Integer> {

    Optional<Fruit> findByNameIgnoreCase(String name);
}
