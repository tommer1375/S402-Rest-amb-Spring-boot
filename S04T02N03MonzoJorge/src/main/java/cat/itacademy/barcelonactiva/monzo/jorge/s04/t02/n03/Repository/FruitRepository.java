package cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n03.Repository;

import java.util.*;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.bson.types.ObjectId;

import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n03.Domain.Fruit;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends MongoRepository<Fruit, ObjectId> {

    Optional<Fruit> findByNameIgnoreCase(String name);

}