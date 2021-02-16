package edu.fiuba.algo3.modelo.bloques;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.bloques.Bloque;
import edu.fiuba.algo3.modelo.bloques.BloqueMovDerecha;
import edu.fiuba.algo3.modelo.bloques.BloqueRepetirTresVeces;

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
