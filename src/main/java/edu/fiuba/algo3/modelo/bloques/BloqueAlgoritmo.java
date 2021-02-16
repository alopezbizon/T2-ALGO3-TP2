package edu.fiuba.algo3.modelo.bloques;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;

public class BloqueAlgoritmo extends BloqueComplejo{
	
	private String nombre;

	@Override
	public void ejecutar(Personaje personaje, Dibujo dibujo) {
		bloques.forEach(bloque->{
			bloque.ejecutar(personaje, dibujo);
		});
		
	}
	
	public void inicializarNombre(String nombre) {
		this.nombre = nombre;
	}

	public String obtenerNombre() {
		return this.nombre;
	}
}
