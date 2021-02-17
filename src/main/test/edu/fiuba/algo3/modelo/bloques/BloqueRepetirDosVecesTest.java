package edu.fiuba.algo3.modelo.bloques;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;


public class BloqueRepetirDosVecesTest {

	@Test
	public void testRepetirBloqueMovDerecha() {
		Posicion posicionInicial = new Posicion(5, 5);
		Posicion posicionFinal = new Posicion(7, 5);
		Personaje personaje = new Personaje(posicionInicial);
		Bloque bloque = new BloqueMovDerecha();
		BloqueRepetirDosVeces bloqueRepetir = new BloqueRepetirDosVeces();
		
		bloqueRepetir.agregarBloque(bloque);

		bloqueRepetir.ejecutar(personaje, null);

		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

}
