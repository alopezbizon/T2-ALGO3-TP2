package edu.fiuba.algo3.modelo.eventos;

import java.util.List;

import edu.fiuba.algo3.modelo.Tramo;
import edu.fiuba.algo3.modelo.bloques.Bloque;

public class EventosBloque {
	
	private Evento<Bloque> onAgregarBloque = new Evento<>();
	private Evento<List<Tramo>> onDibujar = new Evento<>();

	public Evento<Bloque> getOnAgregarBloque() {
		return onAgregarBloque;
	}
	
	public Evento<List<Tramo>> getOnDibujar() {
		return onDibujar;
	}

}
