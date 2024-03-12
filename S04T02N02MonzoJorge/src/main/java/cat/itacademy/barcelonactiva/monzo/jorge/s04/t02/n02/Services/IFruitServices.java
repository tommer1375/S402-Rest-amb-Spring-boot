package cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n02.Services;

import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n02.Exceptions.FruitNotFoundException;
import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n02.Model.Fruit;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface IFruitServices {

    Fruit add(Fruit fruit);

    Fruit update(int id, Fruit updatedFruit);

    void delete(int id) throws FruitNotFoundException;

    Fruit getOne(int id);

    List<Fruit> getAll();
}