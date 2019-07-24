package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	static Calculadora calc;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass()");
		calc = new Calculadora();
	}

	@Before
	public void before() {
		System.out.println("before()");
		calc.clear();
	}

	@After
	public void after() {
		System.out.println("after()");

	}

	@AfterClass
	public static void afterClass() {
		calc.clear();
		System.out.println("affterClass()");
	}

	@Test
	public void testSum() {
		System.out.println("Sum()");
		int resultado = calc.add(3, 2);
		int esperado = 5;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testSumNegativos() {
		System.out.println("Sum()");
		int resultado = calc.add(-3, 2);
		int esperado = -1;
		assertEquals(esperado, resultado);
	}

	@Test
	public void tesAnstSum() {
		System.out.println("ansSum()");
		calc.add(3, 2);
		int resul = calc.ans();
		int esperado = 5;
		assertEquals(esperado, resul);
	}

	@Test
	public void testDiv() {
		calc.div(6, 7);
		int esperado = 0;
		int resul = calc.ans();
		assertEquals(esperado, resul);

	}

	@Test
	public void testDivrCeroPorX(){
		int expected = 0;
		int actual = calc.div(0, 5);
		assertEquals(expected, actual);

	}

	@Test
	public void testDivPorCero(){
		int expected = 0;
		int actual = calc.div(5, 0);
		assertEquals(expected, actual);
	}

	@Test(timeout = 2100)
	public void testAlgoritmoOptimo() {
		calc.operacionOptima();
	}

	/**
	 * @Test public void testSuma() { int resultado = Calculadora.suma(2, 3); int
	 *       esperado = 5; assertEquals(esperado, resultado); }
	 * 
	 * @Test public void testResta() { int resultado = Calculadora.resta(3, 2); int
	 *       esperado = 1; assertEquals(esperado, resultado); }
	 **/

}
