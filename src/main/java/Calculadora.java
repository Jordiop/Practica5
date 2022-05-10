public class Calculadora implements ICalculadora{
    public float suma(float a, float b){
        return a + b;
    }

    public float resta(float a, float b){
        return a - b;
    }

    public float multiplicacion(float a, float b){
        return a * b;
    }

    public float division (float a, float b) {
        return (a/b);
    }

    public static void main (String [] args){
        // Crear objeto calculadora
        Calculadora calculadora = new Calculadora();

        // Método suma
        System.out.println("Suma");
        System.out.println(calculadora.suma(1,3));

        // Método resta
        System.out.println("Resta");
        System.out.println(calculadora.resta(4,3));

        // Método multiplicación
        System.out.println("Multiplicacion");
        System.out.println(calculadora.multiplicacion(4,5));

        // Método división
        System.out.println("Division");
        System.out.println(calculadora.division(7,5));

    }
}
