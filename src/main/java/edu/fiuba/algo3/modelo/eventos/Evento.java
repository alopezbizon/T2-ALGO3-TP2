package edu.fiuba.algo3.modelo.eventos;

import java.util.ArrayList;

public class Evento<C> {

	private ArrayList<EventoCallback<C>> callbacks = new ArrayList<>();

	public void notificar(C c) {
		for (EventoCallback<C> eventoCallback : callbacks) {
			eventoCallback.notificar(c);
		}
	}

	public ArrayList<EventoCallback<C>> getCallbacks() {
		return callbacks;
	}
}
