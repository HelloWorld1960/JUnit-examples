package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import calculadora.Calculadora;

//Pruebas parametrizadas: Es una forma de poder ejecutar pruebas unitarias en las que lo que se decea es poder comprobar 
//que para varios valores obtenemos varios resultados.
//@RunWhit sirve para decirle a JUnit que se ejecute con un Runer particular, en este caso Parameterized.
//Parameterized es el constructor que se ocupa de hacer las pruebas parametrizadas y necesita un metodo del tipo 
//public static que retorne un objeto del tipo Iterable, que ademas sea del tipo Object[] y una notacion @Parameters.
//El constructor avalua cada parametro indicado en el @Parameters.
@RunWith(value = Parameterized.class)
public class CalculadoraParametroTest {
	//Atributos
	private int a, b, exp;
	
	@Parameters
	public static Iterable<Object[]> getDatos(){
		//Cada uno de los elementos del array de Objetct debe de tener el mismo numero de parametros que el constructor. 
		List<Object[]> objL = new ArrayList<>();
		
		objL.add(new Object[] {3, 1, 4});
		objL.add(new Object[] {3, 3, 6});
		objL.add(new Object[] {1, 1, 2});
		objL.add(new Object[] {-1, 1, 0});
		
		return (objL);
		
		//Forma simplificada.
		//return (Arrays.asList(new Object[][]{
		//{3,1,4}, {3, 3, 6}, {1, 1, 2}
		//}));
		
	}
	
	//Constructor
	public CalculadoraParametroTest(int a, int b, int exp) {
		this.a = a;
		this.b = b;
		this.exp = exp;
	}
	
	@Test
	public void testAdd() {
		Calculadora calc = new Calculadora();
		int result = calc.add(a, b);
		assertEquals(exp, result);		
	}

}
