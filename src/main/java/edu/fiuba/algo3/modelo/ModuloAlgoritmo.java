package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

import edu.fiuba.algo3.modelo.bloques.Bloque;
import edu.fiuba.algo3.modelo.bloques.BloqueAlgoritmo;
import edu.fiuba.algo3.modelo.bloques.BloqueBajarLapiz;
import edu.fiuba.algo3.modelo.bloques.BloqueComplejo;
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
	
	private Stack<BloqueComplejo> pilaBloquesComplejos = new Stack();
	
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

	public Collection getBloques() {
		return bloques;
	}

	private void agregarBloque(Bloque bloque) {
		if(!pilaBloquesComplejos.isEmpty()) {
			BloqueComplejo bloqueComplejo = pilaBloquesComplejos.pop();
			bloqueComplejo.agregarBloque(bloque);
			pilaBloquesComplejos.push(bloqueComplejo);
		}else
		{
			bloques.add(bloque);
		}
		
		eventos.getOnAgregarBloque().notificar(bloque);
		
//		System.out.println("cant bloques: "+ bloques.size());
	}
	
	private void agregarBloqueComplejo(BloqueComplejo bloqueComplejo) {
		agregarBloque(bloqueComplejo);
		pilaBloquesComplejos.push(bloqueComplejo);	
		System.out.println("cant complejos: "+ pilaBloquesComplejos.size());
		System.out.println("cant bloques: "+ bloques.size());
		
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
		this.agregarBloqueComplejo(new BloqueRepetirDosVeces());		
	}
	
	public void agregarBloqueRepetirTresVeces() {
		this.agregarBloqueComplejo(new BloqueRepetirTresVeces());
	}

	public void agregarBloqueInvertir() {
		this.agregarBloqueComplejo(new BloqueInversor());
	}

	public void agregarBloqueAlgoritmoGuardado() {
		this.agregarBloque(algoritmoGuardado);
	}

	public void ejecutarAlgoritmo() {
		reiniciarPersonajeYDibujo();
		BloqueAlgoritmo algoritmo = new BloqueAlgoritmo();
		
		algoritmo.agregarBloques(bloques);
		algoritmo.ejecutar(personaje, dibujo);	
		System.out.println("cant tramos: "+dibujo.obtenerTramos().size());
		eventos.getOnDibujar().notificar(dibujo.obtenerTramos());
	}

	public void reiniciarAlgoritmo() {
		reiniciarPersonajeYDibujo();
		this.bloques = new ArrayList<>();
		this.pilaBloquesComplejos = new Stack();
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

	public void noAgregaMas() {
		if (pilaBloquesComplejos.isEmpty()) return;
		
		System.out.println("habia cant bloques complejos: "+ pilaBloquesComplejos.size());
		pilaBloquesComplejos.pop();		
	}

}
