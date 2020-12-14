public class BloqueSubirLapiz extends Bloque {
    public void accion{
        Personaje personaje = Personaje.darPersonaje();

        personaje.subirLapiz();
    }
}
