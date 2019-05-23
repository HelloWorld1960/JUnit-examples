package test;

/**
 * JUnit es un framework que nos permite realizar pruebas unitarias de nuestro codigo de manera controlada para verificar 
 * que todo este funcionando correctamente.
 * Una prueba unitaria se define como la prueba de uno de los módulos que componen un programa.
 * */

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import calculadora.Calculadora;

public class CalculadoraTest {
	//Declaracion de un atributo de tipo Calculadora.
	public static Calculadora calc;
	
	// @BeforeClass sirve para ejecutar codigo antes de que se ejecute la prueba, pero solo se ejecutara UNA SOLA VEZ.
	// Esta prueba crea el objeto Calculadora.
	@BeforeClass
	public static void ejecutaBeforeClass() {
		System.out.println("beforeClass()");
		calc = new Calculadora();
	}
	
	// @Before sirve para ejecutar codigo antes de que se ejecute la prueba.
	// 
	@Before
	public void ejecutaBefore() {
		System.out.println("before()");
		calc.clear();
	}

	// @After sirve para ejecutar codigo despues de que se ejecuto la prueba.
	@After
	public void ejecutaAfter() {
		System.out.println("after()");
		
	}
	
	// @AfterClass sirve para ejecutar codigo antes de que se ejecute la prueba, pero solo se ejecutar UNA SOLA VEZ.
	@AfterClass
	public static void ejecutaAfterClass() {
		System.out.println("afterClass()");
	}

	// @Test indica que es un metodo prueba, ademas es una notacion que puede tener parametros como expected o timeout.
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
		System.out.println("operacionOptima()");
		calc.operacionOptima();
	}

}
