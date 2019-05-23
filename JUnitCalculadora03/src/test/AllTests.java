package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWhit sirve para decirle a JUnit que se ejecute con un Runer particular, en este caso Suite.
@RunWith(Suite.class)
//Aqui se indica un Array con las pruebas que queremos que se ejecuten
@Suite.SuiteClasses({ 
	CalculadoraParametroTest.class, 
	CalculadoraTest.class 
})
public class AllTests {

}
