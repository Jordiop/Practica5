import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {
	
		// Tests de los 4 métodos.

        @Test
        void testSuma() {
            Calculadora calculadora = new Calculadora(5,6);
            float c = calculadora.suma(5,6);
            assertEquals(11, c,0);
			/* 
			*	11 es el resultado esperado, 
			*	c es nuestra variable con el método realizando dicho procedimiento 
			*	0 es el delta, que es el máximo error que queremos permitir. 
			*/

        }

        @Test
        void testResta() {
            Calculadora calculadora = new Calculadora(8,6);
            float c = calculadora.resta(8,6);
            assertEquals(2, c,0);
			/* 
			*	2 es el resultado esperado, 
			*	c es nuestra variable con el método realizando dicho procedimiento 
			*	0 es el delta, que es el máximo error que queremos permitir. 
			*/
        }

        @Test
        void testMultiplicar() {
            Calculadora calculadora = new Calculadora(5,4);
            float c = calculadora.multiplicacion(5,4);
            assertEquals(20, c,0);
			/* 
			*	20 es el resultado esperado, 
			*	c es nuestra variable con el método realizando dicho procedimiento 
			*	0 es el delta, que es el máximo error que queremos permitir. 
			*/
        }

        @Test
        void testDividir() {
            Calculadora calculadora = new Calculadora(7,2);
            float c = calculadora.division(7,2);
            assertEquals(3.5, c,0);
			/* 
			*	3.5 es el resultado esperado, 
			*	c es nuestra variable con el método realizando dicho procedimiento 
			*	0 es el delta, que es el máximo error que queremos permitir. 
			*/
        }

    }

