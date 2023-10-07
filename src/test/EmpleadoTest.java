package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import nominas.*;
import nominas.Empleado.TipoEmpleado;

class EmpleadoTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void testCalculoNominaBrutaEncargado() {
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1200, 10);
		float expected = 2900;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVendedor() {
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1200, 10);
		float expected = 2400;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaOtro() {
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Otro, 1200, 10);
		float expected = -1;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasMenos1000() {
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 500, 10);
		float expected = 2800;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasMayores1000Menores1500() {
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1200, 10);
		float expected = 2900;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasMas1500() {
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 2000, 10);
		float expected = 3000;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentas1000() {
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1000, 10);
		float expected = 2900;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentas1500() {
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1500, 10);
		float expected = 3000;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaVentasNegativas() {
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, -100, 10);
		float expected = -1;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtraPositivas() {
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1200, 10);
		float expected = 2900;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaBrutaHorasExtraNegativas() {
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1200, -10);
		float expected = -1;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}

	@Test
	void testCalculoNominaNetaMenos2100() {
		float actual = Empleado.calculoNominaNeta(2000);
		float expected = 2000;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNetaMas2100Menos2500() {
		float actual = Empleado.calculoNominaNeta(2200);
		float expected = 1870;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNetaMas2500() {
		float actual = Empleado.calculoNominaNeta(3000);
		float expected = 2460;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNeta2100() {
		float actual = Empleado.calculoNominaNeta(2100);
		float expected = 1785;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNeta2500() {
		float actual = Empleado.calculoNominaNeta(2500);
		float expected = 2050;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}
	
	@Test
	void testCalculoNominaNetaNegativa() {
		float actual = Empleado.calculoNominaNeta(-2000);
		float expected = -1;
		assertEquals(expected, actual);
		//fail("Not yet implemented");
	}

}
