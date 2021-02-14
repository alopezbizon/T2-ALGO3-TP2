package edu.fiuba.algo3.modelo;

public class BloqueInversor extends BloqueComplejo{
	
	@Override
	public void ejecutar(Personaje personaje, Dibujo dibujo) {
		bloques.forEach(bloque->{
			bloque.ejecutarInversa(personaje, dibujo);
		});
		
	}

}
