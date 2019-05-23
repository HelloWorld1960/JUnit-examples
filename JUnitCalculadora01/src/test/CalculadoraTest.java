package test;
/**
 * JUnit es un framework que nos permite realizar pruebas unitarias de nuestro codigo de manera controlada para verificar 
 * que todo este funcionando correctamente.
 * 
 * */
import static org.junit.Assert.*;
import org.junit.Test;
import calculadora.Calculadora;

public class CalculadoraTest {

	// @Test indica que es un metodo prueba.
	@Test
	public void testSuma() {
		// Llamamos al metodo suma.
		int resultado = Calculadora.suma(2, 3);
		// Indicamos un valor esperado del resultado.
		int esperado = 5; // 2 + 3 = 5
		// Asserts es un metodo de JUnit para validar resultados.
		assertEquals(esperado, resultado);
	}

	// @Test indica que es un metodo prueba.
	@Test
	public void testResta() {
		// Llamamos al metodo resta.
		int resultado = Calculadora.resta(3, 2);
		// Indicamos un valor esperado del resultado.
		int esperado = 1; // 3 - 2 = 1
		// Asserts es un metodo de JUnit para validar resultados.
		assertEquals(esperado, resultado);
	}

}
