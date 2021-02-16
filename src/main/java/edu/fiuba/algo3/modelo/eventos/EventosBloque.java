package edu.fiuba.algo3.modelo.eventos;

import edu.fiuba.algo3.modelo.bloques.Bloque;

public class EventosBloque {
	
	private Evento<Bloque> onAgregarBloque = new Evento<>();

	public Evento<Bloque> getOnAgregarBloque() {
		return onAgregarBloque;
	}

}
