package cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n02.Controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n02.Model.Fruit;
import cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n02.Services.FruitServices;

@RestController
@RequestMapping("/fruit")
public class FruitController {

    @Autowired
    private final FruitServices fruitService;

    FruitController(FruitServices fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/add")
    public ResponseEntity<Fruit> add(@RequestBody Fruit fruit) {
        Fruit savedFruit = fruitService.add(fruit);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedFruit);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Fruit> update(@PathVariable("id") int id, @RequestBody Fruit fruit) {
        Fruit modifiedFruit = fruitService.update(id, fruit);

        return ResponseEntity.status(HttpStatus.OK).body(modifiedFruit);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") int id) {
        fruitService.delete(id);

        return ResponseEntity.ok("Fruit with id " + id + " deleted successfully");
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> findById(@PathVariable("id") int id) {
        Fruit searchedFruit = fruitService.getOne(id);

        return ResponseEntity.status(HttpStatus.OK).body(searchedFruit);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll() {
        List<Fruit> searchedFruits = fruitService.getAll();

        return ResponseEntity.status(HttpStatus.FOUND).body(searchedFruits);
    }
}

