public class Personaje {

    private static Personaje personaje;
    private  Lapiz lapiz;
    private  int posicionX;
    private  int posicionY;

    private Personaje(){
        posicionX = 0;
        posicionY = 0;
        lapiz = new LapizArriba;

    }

    public static Personaje darPersonaje(){
        if(personaje == null){
            personaje = new Personaje();
        }

        return personaje;
    }

    public void subirLapiz(){
        lapiz = new LapizArriba;
    }
    public void bajarLapiz(){
        lapiz = new LapizAbajo;
    }
    public void moverDerecha(){
        posicionX++;
    }
    public void moverIzquierda(){
        posicionX--;
    }
    public void moverArriba(){
        posicionY--;
    }
    public void moverAbajo(){
        posicionY++;
    }
}