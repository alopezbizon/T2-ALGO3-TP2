package edu.fiuba.algo3.modelo;

public class BloqueAlgoritmo extends BloqueComplejo{

	@Override
	public void ejecutar(Personaje personaje, Dibujo dibujo) {
		bloques.forEach(bloque->{
			bloque.ejecutar(personaje, dibujo);
		});
		
	}
}
