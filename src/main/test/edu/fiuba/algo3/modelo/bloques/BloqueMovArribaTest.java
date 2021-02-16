package edu.fiuba.algo3.modelo.bloques;

import org.junit.jupiter.api.Test;

import edu.fiuba.algo3.modelo.Dibujo;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.bloques.Bloque;
import edu.fiuba.algo3.modelo.bloques.BloqueMovArriba;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class BloqueMovArribaTest {

    @Test
    public void testBloqueMovArriba_deberiaMoverElPersonajeUnaPosicionHaciaArriba() {
        Posicion posicionInicial = new Posicion(5, 5);
        Posicion posicionFinal = new Posicion(5,6);
        Personaje personaje = new Personaje(posicionInicial);
        Bloque bloque = new BloqueMovArriba();
        Dibujo dibujo = new Dibujo();

        bloque.ejecutar(personaje, dibujo);

        assertTrue(personaje.obtenerPosicion().equals(posicionFinal));
    }
}
