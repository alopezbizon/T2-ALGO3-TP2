package edu.fiuba.algo3.modelo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BloqueRepetirTresVecesTest {
	
	@Test
	public void testRepetirBloqueMovDerecha() {
		Posicion posicionInicial = new Posicion(5, 5);
		Posicion posicionFinal = new Posicion(8, 5);
		Personaje personaje = new Personaje(posicionInicial);
		Bloque bloque = new BloqueMovDerecha();
		BloqueRepetirTresVeces bloqueRepetir = new BloqueRepetirTresVeces();
		
		bloqueRepetir.agregarBloque(bloque);

		bloqueRepetir.ejecutar(personaje, null);

		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

}
