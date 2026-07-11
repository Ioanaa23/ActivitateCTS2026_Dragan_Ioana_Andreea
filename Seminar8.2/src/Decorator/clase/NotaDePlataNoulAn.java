package Decorator.clase;

public class NotaDePlataNoulAn extends NotaDePlataDecorator{

    public NotaDePlataNoulAn(INotaDePlata nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("An nou fericit! La multi ani!");
    }
}
