package controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StartTest {

	@Test
	void valoresMenoresQueCeroTest() {
		Start s = new Start();
		assertEquals(-1, s.calcularSalarioNeto(-1, 10, 10));
		assertEquals(-1, s.calcularSalarioNeto(10, -1, 10));
		assertEquals(-1, s.calcularSalarioNeto(10, 10, -1));
		assertEquals(-1, s.calcularSalarioNeto(-1, -1, -1));
	}
	
	@Test
	void horasExtras() {
		Start s = new Start();
		assertEquals(729, s.calcularSalarioNeto(10, 10, 15));
		assertEquals(729, s.calcularSalarioNeto(10, 10, 10));
		assertEquals(594, s.calcularSalarioNeto(10, 10, 5));
	}
	
	@Test
	void altoSalario() {
		Start s = new Start();
		assertEquals(21930, s.calcularSalarioNeto(500, 500, 500));
	}

}
