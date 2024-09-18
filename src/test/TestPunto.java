package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import ejercicio2.Punto;

class TestPunto {

	@Test
	void crearPuntoSinParametros() {
		Punto punto = new Punto();

		assertNotNull(punto);

	}

	@Test
	void estaSobreEjeX() {
		Punto p = new Punto(1.5, 0);

		assertTrue(p.estaSobreElEjeX());
	}

}
