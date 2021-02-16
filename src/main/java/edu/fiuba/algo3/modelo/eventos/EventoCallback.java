package edu.fiuba.algo3.modelo.eventos;

public interface EventoCallback<C> {
	void notificar(C c);
}
