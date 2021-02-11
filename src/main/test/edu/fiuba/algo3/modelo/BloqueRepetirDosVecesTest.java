package edu.fiuba.algo3.modelo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BloqueRepetirDosVecesTest {

	@Test
	void testRepetirBloqueMovDerecha() {
		Posicion posicionInicial = new Posicion(5, 5);
		Posicion posicionFinal = new Posicion(7, 5);
		Personaje personaje = new Personaje(posicionInicial);
		Bloque bloque = new BloqueMovDerecha();
		BloqueRepetirDosVeces bloqueRepetir = new BloqueRepetirDosVeces();
		
		bloqueRepetir.agregarBloque(bloque);

		bloqueRepetir.accion(personaje, null);

		assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));
	}

}
