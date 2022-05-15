public class Calculadora implements ICalculadora{
    // A y B hacen referencia al primer número y al segundo
    private float a;
    private float b;

	// Constructor de calculadora
    public Calculadora(float a, float b) {
        this.a = a;
        this.b = b;

    }

	// Método suma
    @Override
    public float suma(float a, float b){
        return a + b;
    }

	// Método resta
    @Override
    public float resta(float a, float b){
        return a - b;
    }

	// Método multiplicación
    @Override
    public float multiplicacion(float a, float b){
        return a * b;
    }

	// Método división
    @Override
    public float division (float a, float b) {
        return (a/b);
    }

}
