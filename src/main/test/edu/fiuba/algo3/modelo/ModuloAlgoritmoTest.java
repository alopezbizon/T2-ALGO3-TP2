package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import edu.fiuba.algo3.modelo.bloques.BloqueMovAbajo;
import edu.fiuba.algo3.modelo.bloques.BloqueMovArriba;


public class ModuloAlgoritmoTest {
	
	private ModuloAlgoritmo modulo;
	
	@BeforeEach
	public void init() {
		modulo = new ModuloAlgoritmo();
	}
	
	@Test
	public void crearModuloVacio() {
		assertTrue(modulo.isEmpty());
	}
	
}
