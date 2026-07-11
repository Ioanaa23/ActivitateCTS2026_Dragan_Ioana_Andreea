package Decorator.clase;

public class NotaDePlata1Mai extends NotaDePlataDecorator{
    public NotaDePlata1Mai(INotaDePlata nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("1 mai grataresc!");
    }
}
