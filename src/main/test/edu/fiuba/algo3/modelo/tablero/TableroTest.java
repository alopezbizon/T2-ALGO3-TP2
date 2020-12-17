package edu.fiuba.algo3.modelo.tablero;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class TableroTest {

    @Test
    public void testTableroValidarPosicion_deberiaDevolverTrueSiLaPosicionEstaDentroDeSuDimension() {
        Tablero tablero = Tablero.darTablero();
        Posicion posicion = new Posicion(1,1);

        assertTrue(tablero.validarPosicion(posicion));
    }

    @Test
    public void testTableroValidarPosicion_deberiaDevolverFalseSiLaPosicionNoEstaDentroDeSuDimensionEnXeY() {
        Tablero tablero = Tablero.darTablero();
        Posicion posicion1 = new Posicion(-1,-1);
        Posicion posicion2 = new Posicion(15,15);

        assertFalse(tablero.validarPosicion(posicion1));
        assertFalse(tablero.validarPosicion(posicion2));
    }

    @Test
    public void testTableroValidarPosicion_deberiaDevolverFalseSiLaPosicionNoEstaDentroDeSuDimensionEnX() {
        Tablero tablero = Tablero.darTablero();
        Posicion posicion1 = new Posicion(-1,1);
        Posicion posicion2 = new Posicion(15,14);

        assertFalse(tablero.validarPosicion(posicion1));
        assertFalse(tablero.validarPosicion(posicion2));
    }

    @Test
    public void testTableroValidarPosicion_deberiaDevolverFalseSiLaPosicionNoEstaDentroDeSuDimensionEnY() {
        Tablero tablero = Tablero.darTablero();
        Posicion posicion1 = new Posicion(1,-1);
        Posicion posicion2 = new Posicion(14,15);

        assertFalse(tablero.validarPosicion(posicion1));
        assertFalse(tablero.validarPosicion(posicion2));
    }
}
