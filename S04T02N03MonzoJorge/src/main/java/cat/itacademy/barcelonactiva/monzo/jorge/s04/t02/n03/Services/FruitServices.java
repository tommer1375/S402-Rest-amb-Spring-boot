package cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n03.Services;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n03.Exceptions.FruitAlreadyExistsException;
import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n03.Exceptions.FruitNotFoundException;
import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n03.Domain.Fruit;
import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n03.Repository.FruitRepository;
import org.springframework.stereotype.Service;

@Service
public class FruitServices implements IFruitServices {

    @Autowired
    private final FruitRepository fruitRepository;

    public FruitServices(FruitRepository fruitRepository)
    {
        this.fruitRepository = fruitRepository;
    }


    @Override
    public Fruit add(Fruit fruit)
    {
        fruitRepository.findByNameIgnoreCase(fruit.getName())
                .ifPresent(f -> {
                    throw new FruitAlreadyExistsException("It already exists a fruit with name " + fruit.getName());
                });

        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit update(ObjectId id, Fruit updatedFruit)
    {
        Optional<Fruit> searchedFruitDb = fruitRepository.findById(id);

        if(searchedFruitDb.isPresent()) {
            Fruit newFruitDb = searchedFruitDb.get();
            newFruitDb.setName(updatedFruit.getName());
            newFruitDb.setWeightKG(updatedFruit.getWeightKG());
            return fruitRepository.save(newFruitDb);
        } else {
            throw new FruitNotFoundException("Fruit with Id " + id + " is not found");
        }

    }

    @Override
    public void delete(ObjectId id)
    {
        Fruit fruitFound = fruitRepository.findById(id).orElseThrow(
                () -> {
                    throw new FruitNotFoundException("Fruit with Id " + id + " is not found");
                });

        fruitRepository.deleteById(fruitFound.getId());
    }

    //getOne is @Deprecated //use findById() instead
    @Override
    public Fruit getOne(ObjectId id)
    {
        return fruitRepository.findById(id).orElseThrow(
                () -> {
                    throw new FruitNotFoundException("Fruit with Id " + id + " is not found");
                });

    }

    @Override
    public List<Fruit> getAll()
    {
        return (List<Fruit>) fruitRepository.findAll();
    }

}