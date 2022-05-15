# Practica5
Práctica 5 de Entornos de Desarrollo

## Clase Calculadora

```
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
```

## Interfaz
```
public interface ICalculadora {
    public float suma(float a, float b);
    public float resta(float a, float b);
    public float multiplicacion(float a, float b);
    public float division(float a, float b);
}
```

## Clase CalculadoraTest
```
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

        @Test
        void testSuma() {
            Calculadora calculadora = new Calculadora(5,6);
            float c = calculadora.suma(5,6);
            assertEquals(11, c,0);

        }

        @Test
        void testResta() {
            Calculadora calculadora = new Calculadora(8,6);
            float c = calculadora.resta(8,6);
            assertEquals(2, c,0);
        }

        @Test
        void testMultiplicar() {
            Calculadora calculadora = new Calculadora(5,4);
            float c = calculadora.multiplicacion(5,4);
            assertEquals(20, c,0);
        }

        @Test
        void testDividir() {
            Calculadora calculadora = new Calculadora(7,2);
            float c = calculadora.division(7,2);
            assertEquals(3.5, c,0);
        }

    }
```

## Resultado tras tests
![image](https://user-images.githubusercontent.com/95173613/168472159-34f0755d-880c-4b94-977e-24b9e094b736.png)

## Ramas
![Diagrama](https://user-images.githubusercontent.com/95173613/168474727-456fe4ee-0a02-4a9d-8afb-baf7a65fa364.png)

