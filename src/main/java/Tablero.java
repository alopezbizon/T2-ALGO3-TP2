public class Tablero {
    private static Tablero tablero;
    int[][] celdas;
    int maxCeldas;
    int minCeldas;

    private Tablero(){
        celdas = new int[15][15];
        maxCeldas = 15;
        minCeldas = 0;
    }

    public static Tablero darTablero(){
        if(tablero == null){
            tablero = new Tablero();
        }

        return tablero;
    }

    public boolean validarPosicion(int nuevaPosicion){
        return (nuevaPosicion <= maxCeldas && nuevaPosicion >= minCeldas);
    }

}
