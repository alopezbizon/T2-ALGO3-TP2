public class BloqueBajarLapiz extends Bloque {
    public void accion{
        Personaje personaje = Personaje.darPersonaje();

        personaje.bajarLapiz();
    }
}
