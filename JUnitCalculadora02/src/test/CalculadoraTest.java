package test;

/**
 * JUnit es un framework que nos permite realizar pruebas unitarias de nuestro codigo de manera controlada para verificar 
 * que todo este funcionando correctamente.
 * 
 * */
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import calculadora.Calculadora;

public class CalculadoraTest {

	Calculadora calc;
	
	// @Before sirve para ejecutar codigo antes de que se ejecute la prueba.
	// En este caso creamos un objeto Calculadora el cual sera usado en los
	// siguientes metodos.
	@Before
	public void ejecutaBefore() {
		System.out.println("before()");
		calc = new Calculadora();
	}

	// @After sirve para ejecutar codigo despues de que se ejecuto la prueba.
	@After
	public void ejecutaAfter() {
		System.out.println("after()");
		calc.clear();
	}

	// @Test indica que es un metodo prueba.
	// Test es una notacion que puede tener parametros como expected o timeout.
	// expected es un parametro que puede utilizarse para indicar que un metodo
	// tiene una determinada excepcion, de este modo
	// lo que conseguimos es que una prueba unitaria falle en el caso de que no se
	// arroje una excepcion que se supone
	// que deberia arrojarse.
	@Test
	public void testSuma() {
		System.out.println("sum()");
		// Llamamos al metodo suma.
		int resultado = Calculadora.add(2, 3);
		// Indicamos un valor esperado del resultado.
		int esperado = 5; // 2 + 3 = 5
		// Asserts es un metodo de JUnit para validar resultados.
		assertEquals(esperado, resultado);
	}

	// @Test indica que es un metodo prueba.
	@Test
	public void testResta() {
		System.out.println("sub()");
		// Llamamos al metodo resta.
		int resultado = Calculadora.sub(3, 2);
		// Indicamos un valor esperado del resultado.
		int esperado = 1; // 3 - 2 = 1
		// Asserts es un metodo de JUnit para validar resultados.
		assertEquals(esperado, resultado);
	}

	@Test
	public void testDiv() {
		System.out.println("dividir()");
		calc.div(5, 2);
	}

	// @Test indica que es un metodo prueba.
	// Test es una notacion que puede tener parametros como expected o timeout.
	// expected es un parametro que puede utilizarse para indicar que un metodo
	// tiene una determinada excepcion, de este modo
	// lo que conseguimos es que una prueba unitaria falle en el caso de que no se
	// arroje una excepcion que se supone
	// que deberia arrojarse.
	@Test(expected = ArithmeticException.class)
	public void testDivPorCero() {
		System.out.println("divCero()");
		calc.div(5, 2);
	}

	// @Test indica que es un metodo prueba.
	// Test es una notacion que puede tener parametros como expected o timeout.
	// timeout es un parametro para hacer que una prueba falle si toma mas tiempo de
	// lo normal haciendo la prueba.
	@Test(timeout = 100)
	public void testAlgoritmoOptimo() {
		System.out.println("operacionOtima()");
		calc.operacionOptima();
	}

}
