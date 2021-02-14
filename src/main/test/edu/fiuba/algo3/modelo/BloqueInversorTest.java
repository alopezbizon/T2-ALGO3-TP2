package edu.fiuba.algo3.modelo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BloqueInversorTest {
	
	private BloqueInversor bloqueInversor;
	private Personaje personaje;
	
	private Posicion posicionInicial;	
	private Posicion posicionFinal;
	
	@BeforeEach
	public void init() {
		bloqueInversor = new BloqueInversor();
		posicionInicial = new Posicion(0,0);
		posicionFinal = new Posicion(0,0);
		personaje = new Personaje(posicionInicial);
	}
	
	@Test
	public void AgregoConMovDerechaDebeEjecutarseIzquierda() {
		
		posicionFinal.sumar(new Posicion(-1,0));
		
		bloqueInversor.agregarBloque(new BloqueMovDerecha());
		
		bloqueInversor.ejecutar(personaje, null);
			
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}
	
	@Test
	public void AgregoConMovIzquierdaDebeEjecutarseDerecha() {
		
		posicionFinal.sumar(new Posicion(1,0));
		
		bloqueInversor.agregarBloque(new BloqueMovIzquierda());
		
		bloqueInversor.ejecutar(personaje, null);
			
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}
	
	@Test
	public void AgregoConMovAbajoDebeEjecutarseArriba() {
		
		posicionFinal.sumar(new Posicion(0,1));
		
		bloqueInversor.agregarBloque(new BloqueMovAbajo());
		
		bloqueInversor.ejecutar(personaje, null);
			
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}
	
	@Test
	public void AgregoConMovArribaDebeEjecutarseAbajo() {
		
		posicionFinal.sumar(new Posicion(0,-1));
		
		bloqueInversor.agregarBloque(new BloqueMovArriba());
		
		bloqueInversor.ejecutar(personaje, null);
			
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}
	
	@Test
	public void AgregoConMovArribaYDerechaDebeEjecutarseOpuesto() {
		
		posicionFinal.sumar(new Posicion(-1,-1));
		
		bloqueInversor.agregarBloque(new BloqueMovArriba());
		bloqueInversor.agregarBloque(new BloqueMovDerecha());
		
		bloqueInversor.ejecutar(personaje, null);
			
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}
	
	@Test
	public void AgregoConMovArribaYDerechaEnBloqueDeRepetirDosVecesDebeEjecutarseOpuesto() {
		
		posicionFinal.sumar(new Posicion(-2,-2));
		
		BloqueRepetir bloqueRepetir = new BloqueRepetirDosVeces();
		bloqueRepetir.agregarBloque(new BloqueMovArriba());
		bloqueRepetir.agregarBloque(new BloqueMovDerecha());
		
		bloqueInversor.agregarBloque(bloqueRepetir);
		
		bloqueInversor.ejecutar(personaje, null);
			
		assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
	}

}
