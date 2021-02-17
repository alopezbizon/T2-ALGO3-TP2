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
		Bloque bloque = new BloqueAlgoritmo();
		bloques.add(bloque);
		eventos.getOnAgregarBloque().notificar(bloque);
	}

	public void ejecutarAlgoritmo() {
		// TODO: lógica, evento y notificación.
	}

	public void reiniciarAlgoritmo() {
		this.bloques = new ArrayList<>();
		// TODO: evento y notificación.
	}

	public void guardarAlgoritmo() {
		// TODO: lógica, evento y notificación.
	}
}
