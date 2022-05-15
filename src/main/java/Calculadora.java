public class Calculadora implements ICalculadora{
    // A y B hacen referencia al Primer número y al segundo
    private float a;
    private float b;


    public Calculadora(float a, float b) {
        this.a = a;
        this.b = b;

    }

    @Override
    public float suma(float a, float b){
        return a + b;
    }

    @Override
    public float resta(float a, float b){
        return a - b;
    }

    @Override
    public float multiplicacion(float a, float b){
        return a * b;
    }

    @Override
    public float division (float a, float b) {
        return (a/b);
    }

}
