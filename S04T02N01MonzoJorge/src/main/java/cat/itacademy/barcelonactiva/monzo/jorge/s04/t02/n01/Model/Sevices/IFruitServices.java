package cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n01.Model.Sevices;
import java.util.List;

import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n01.Model.Exceptions.FruitNotFoundException;
import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n01.Model.Domain.Fruit;
import org.springframework.stereotype.Service;


@Service
public interface IFruitServices {

    Fruit add(Fruit fruit);
    Fruit update(int id, Fruit updatedFruit);
    void delete(int id) throws FruitNotFoundException;
    Fruit getOne(int id);
    List<Fruit> getAll();

}