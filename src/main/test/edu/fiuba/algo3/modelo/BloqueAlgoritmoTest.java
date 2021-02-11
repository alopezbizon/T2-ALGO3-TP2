package edu.fiuba.algo3.modelo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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
		
		algoritmo.accion(personaje, null);
		
		posicionFinal = posicionInicial;
		assertTrue(personaje.obtenerPosicion().esIgual(posicionInicial));
	}
	
	@Test
	public void testAgregarUnBloqueMovimientoAbajo() {
				
		algoritmo.agregarBloque(new BloqueMovAbajo());		
		algoritmo.accion(personaje, null);
		
		posicionFinal = new Posicion(0,-1);
		assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));		
	}
	
	@Test
	public void testAgregarDosBloquesVuelveAlaPosicionInicial() {
				
		algoritmo.agregarBloque(new BloqueMovAbajo());		
		algoritmo.agregarBloque(new BloqueMovArriba());
		algoritmo.accion(personaje, null);
		
		posicionFinal = posicionInicial;
		assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));		
	}
	
	@Test
	public void testAgregoBloqueMovArribaYBloqueConRepeticionDosVeces() {
		
		algoritmo.agregarBloque(new BloqueMovAbajo());
		
		bloqueRepetir = new BloqueRepetirDosVeces();
		bloqueRepetir.agregarBloque(new BloqueMovDerecha());
		
		algoritmo.agregarBloque(bloqueRepetir);
		
		algoritmo.accion(personaje, null);

		posicionFinal = new Posicion(2,-1);
		assertTrue(personaje.obtenerPosicion().esIgual(posicionFinal));				
	}

}
