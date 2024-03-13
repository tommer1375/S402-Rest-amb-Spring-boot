package cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n03.Exceptions;


public class FruitNotFoundException extends RuntimeException {

    public FruitNotFoundException(String msg)
    {
        super(msg);
    }
}