package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Collection;

import edu.fiuba.algo3.modelo.bloques.Bloque;
import edu.fiuba.algo3.modelo.bloques.BloqueAlgoritmo;
import edu.fiuba.algo3.modelo.bloques.BloqueBajarLapiz;
import edu.fiuba.algo3.modelo.bloques.BloqueInversor;
import edu.fiuba.algo3.modelo.bloques.BloqueMovAbajo;
import edu.fiuba.algo3.modelo.bloques.BloqueMovArriba;
import edu.fiuba.algo3.modelo.bloques.BloqueMovDerecha;
import edu.fiuba.algo3.modelo.bloques.BloqueMovIzquierda;
import edu.fiuba.algo3.modelo.bloques.BloqueRepetirDosVeces;
import edu.fiuba.algo3.modelo.bloques.BloqueRepetirTresVeces;
import edu.fiuba.algo3.modelo.bloques.BloqueSubirLapiz;
import edu.fiuba.algo3.modelo.eventos.EventosBloque;


public class ModuloAlgoritmo {
	
	private ArrayList<Bloque> bloques = new ArrayList<Bloque>();
	private EventosBloque eventos = new EventosBloque();
	
	private BloqueAlgoritmo algoritmoGuardado = new BloqueAlgoritmo();
	
	private Personaje personaje = new Personaje(new Posicion(0,0));
	private Dibujo dibujo = new Dibujo();
	
	public EventosBloque getEventos() {
		return eventos;
	}

	public boolean estaVacio() {
		return bloques.isEmpty();
	}
	
	public int tamanio() {
		return bloques.size();
	}

	public void eliminarUltimoBloque() {
		bloques.remove(bloques.size()-1);
		
	}

	public void agregarBloqueMovimientoArriba() {
		Bloque bloque = new BloqueMovArriba();
		bloques.add(bloque);
		eventos.getOnAgregarBloque().notificar(bloque);
	}

	public Collection getBloques() {
		return bloques;
	}

	public void agregarBloqueMovimientoAbajo() {
		Bloque bloque = new BloqueMovAbajo();
		bloques.add(bloque);
		eventos.getOnAgregarBloque().notificar(bloque);			
	}	

	public void agregarBloqueMovimientoDerecha() {
		Bloque bloque = new BloqueMovDerecha();
		bloques.add(bloque);
		eventos.getOnAgregarBloque().notificar(bloque);		
	}
	
	public void agregarBloqueMovimientoIzquierda() {
		Bloque bloque = new BloqueMovIzquierda();
		bloques.add(bloque);
		eventos.getOnAgregarBloque().notificar(bloque);		
	}

	public void agregarBloqueLapizArriba() {
		Bloque bloque = new BloqueSubirLapiz();
		bloques.add(bloque);
		eventos.getOnAgregarBloque().notificar(bloque);
	}
	
	public void agregarBloqueLapizAbajo() {
		Bloque bloque = new BloqueBajarLapiz();
		bloques.add(bloque);
		eventos.getOnAgregarBloque().notificar(bloque);
	}

	public void agregarBloqueRepetirDosVeces() {
		Bloque bloque = new BloqueRepetirDosVeces();
		bloques.add(bloque);
		eventos.getOnAgregarBloque().notificar(bloque);
	}
	
	public void agregarBloqueRepetirTresVeces() {
		Bloque bloque = new BloqueRepetirTresVeces();
		bloques.add(bloque);
		eventos.getOnAgregarBloque().notificar(bloque);
	}

	public void agregarBloqueInvertir() {
		Bloque bloque = new BloqueInversor();
		bloques.add(bloque);
		eventos.getOnAgregarBloque().notificar(bloque);
	}

	public void agregarBloqueAlgoritmoGuardado() {
		bloques.add(algoritmoGuardado);
		eventos.getOnAgregarBloque().notificar(algoritmoGuardado);
	}

	public void ejecutarAlgoritmo() {
		reiniciarPersonajeYDibujo();
		BloqueAlgoritmo algoritmo = new BloqueAlgoritmo();
		
		algoritmo.agregarBloques(bloques);
		algoritmo.ejecutar(personaje, dibujo);	
		System.out.println(dibujo.obtenerTramos().size());
		eventos.getOnDibujar().notificar(dibujo.obtenerTramos());
	}

	public void reiniciarAlgoritmo() {
		reiniciarPersonajeYDibujo();
		this.bloques = new ArrayList<>();		
		eventos.getOnReiniciar().notificar("");
	}

	public void guardarAlgoritmo() {
		algoritmoGuardado = new BloqueAlgoritmo();
		algoritmoGuardado.agregarBloques(bloques);
	}
	
	private void reiniciarPersonajeYDibujo() {
		dibujo = new Dibujo();
		personaje = new Personaje(new Posicion(0,0));		
	}
}
