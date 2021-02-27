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
	
	private ArrayList<Bloque> bloques = new ArrayList<>();
	private final EventosBloque eventos = new EventosBloque();
	
	private BloqueAlgoritmo algoritmoGuardado = new BloqueAlgoritmo();
	
	private Personaje personaje = new Personaje(new Posicion(0,0));
	private Dibujo dibujo = new Dibujo();
	
	public EventosBloque getEventos() {
		return eventos;
	}

	public boolean isEmpty() {
		return bloques.isEmpty();
	}
	
	public int size() {
		return bloques.size();
	}

	public void eliminarUltimoBloque() {
		bloques.remove(bloques.size()-1);
	}

	public Collection getBloques() {
		return bloques;
	}

	private void agregarBloque(Bloque bloque) {
		bloques.add(bloque);
		eventos.getOnAgregarBloque().notificar(bloque);
	}

	public void agregarBloqueMovimientoArriba() {
		this.agregarBloque(new BloqueMovArriba());
	}

	public void agregarBloqueMovimientoAbajo() {
		this.agregarBloque(new BloqueMovAbajo());
	}	

	public void agregarBloqueMovimientoDerecha() {
		this.agregarBloque(new BloqueMovDerecha());
	}
	
	public void agregarBloqueMovimientoIzquierda() {
		this.agregarBloque(new BloqueMovIzquierda());
	}

	public void agregarBloqueLapizArriba() {
		this.agregarBloque(new BloqueSubirLapiz());
	}
	
	public void agregarBloqueLapizAbajo() {
		this.agregarBloque(new BloqueBajarLapiz());
	}

	public void agregarBloqueRepetirDosVeces() {
		this.agregarBloque(new BloqueRepetirDosVeces());
	}
	
	public void agregarBloqueRepetirTresVeces() {
		this.agregarBloque(new BloqueRepetirTresVeces());
	}

	public void agregarBloqueInvertir() {
		this.agregarBloque(new BloqueInversor());
	}

	public void agregarBloqueAlgoritmoGuardado() {
		this.agregarBloque(algoritmoGuardado);
	}

	public void ejecutarAlgoritmo() {
		reiniciarPersonajeYDibujo();
		BloqueAlgoritmo algoritmo = new BloqueAlgoritmo();
		
		algoritmo.agregarBloques(bloques);
		algoritmo.ejecutar(personaje, dibujo);	
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
