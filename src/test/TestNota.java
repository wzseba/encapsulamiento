package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ejercicio1.Nota;

class TestNota {

	@Test
	void aprobadoTest() {
		Nota parcial = new Nota(4);
		assertTrue(parcial.aprobado());
	}

	@Test
	void desaprobadoTest() {
		Nota parcial = new Nota(2);
		assertTrue(parcial.desaprobado());
	}

}
