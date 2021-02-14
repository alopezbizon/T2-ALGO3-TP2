package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BloqueAlgoritmoTest {

	private BloqueAlgoritmo algoritmo;	
	private Personaje personaje;
	
	private Posicion posicionInicial;
	private Posicion posicionFinal;
	
	private BloqueRepetir bloqueRepetir;
	
	@BeforeEach
	void init() {
		algoritmo = new BloqueAlgoritmo();
		posicionInicial = new Posicion(0,0);
		personaje = new Personaje(new Posicion(0,0));		
	}
	
	@Test
	public void testCrearAlgoritmoVacio() {		
		
		algoritmo.ejecutar(personaje, null);
		
		posicionFinal = posicionInicial;
		assertTrue(personaje.obtenerPosicion().equals(posicionInicial));
	}
	
	@Test
	public void testAgregarUnBloqueMovimientoAbajo() {
				
		algoritmo.agregarBloque(new BloqueMovAbajo());		
		algoritmo.ejecutar(personaje, null);
		
		posicionFinal = new Posicion(0,-1);
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}
	
	@Test
	public void testAgregarDosBloquesVuelveAlaPosicionInicial() {
				
		algoritmo.agregarBloque(new BloqueMovAbajo());		
		algoritmo.agregarBloque(new BloqueMovArriba());
		algoritmo.ejecutar(personaje, null);
		
		posicionFinal = posicionInicial;
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}
	
	@Test
	public void testAgregoBloqueMovArribaYBloqueConRepeticionDosVeces() {
		
		algoritmo.agregarBloque(new BloqueMovAbajo());
		
		bloqueRepetir = new BloqueRepetirDosVeces();
		bloqueRepetir.agregarBloque(new BloqueMovDerecha());
		
		algoritmo.agregarBloque(bloqueRepetir);
		
		algoritmo.ejecutar(personaje, null);

		posicionFinal = new Posicion(2,-1);
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

}
