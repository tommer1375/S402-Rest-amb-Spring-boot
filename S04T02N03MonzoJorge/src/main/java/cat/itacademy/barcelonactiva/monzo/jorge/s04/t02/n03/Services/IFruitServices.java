package cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n03.Services;

import java.util.List;

import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n03.Exceptions.FruitNotFoundException;
import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n03.Domain.Fruit;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;



@Service
public interface IFruitServices {
    Fruit add(Fruit fruit);

    Fruit update(ObjectId id, Fruit updatedFruit);

    void delete(ObjectId id) throws FruitNotFoundException;

    Fruit getOne(ObjectId id);

    List<Fruit> getAll();
}