package edu.fiuba.algo3.modelo;

import java.util.ArrayList;
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
	
	private Stack<BloqueComplejo> pilaBloquesComplejos = new Stack<BloqueComplejo>();
	
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
	}
	
	private void agregarBloqueComplejo(BloqueComplejo bloqueComplejo) {
		agregarBloque(bloqueComplejo);
		pilaBloquesComplejos.push(bloqueComplejo);			
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
		eventos.getOnDibujar().notificar(dibujo.obtenerTramos());
	}

	public void reiniciarAlgoritmo() {
		reiniciarPersonajeYDibujo();
		this.bloques = new ArrayList<>();
		this.pilaBloquesComplejos = new Stack<BloqueComplejo>();
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
		
		pilaBloquesComplejos.pop();
		
		if(this.hayComplejoActivo())
			eventos.getOnNoAgregarMas().notificar(getNombreUltimoComplejo());
		else
			eventos.getOnNoAgregarMas().notificar(null);
	}

	public boolean hayComplejoActivo() {
		if (pilaBloquesComplejos.size() == 0)
			return false;
		
		return true;
	}

	public String getNombreUltimoComplejo() {
		BloqueComplejo bloque = pilaBloquesComplejos.pop();
		String nombre = bloque.getNombreBloque();
		pilaBloquesComplejos.push(bloque);
		return nombre;		
	}

}
