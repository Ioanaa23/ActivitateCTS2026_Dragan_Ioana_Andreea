package Decorator.clase;

public abstract class NotaDePlataDecorator implements INotaDePlata{
    private INotaDePlata nota;

    public NotaDePlataDecorator(INotaDePlata nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        this.nota.printeaza();
    }

    public abstract void printeazaFelicitare();
}
