import java.util.Scanner;

public class Tablero {
    private int tamano;
    private char simbolo_Jugador_1;
    private char simbolo_Jugador_2;
    private boolean turno1;
    private char[][] matriz;
    private int[] cantidadFichas;
    private Scanner lector;

    public Tablero(int tamano, char simboloJugador1, char simboloJugador2) {
        this.tamano = tamano;
        this.simbolo_Jugador_1 = simboloJugador1;
        this.simbolo_Jugador_2 = simboloJugador2;
        this.turno1 = true;
        this.matriz = new char[tamano][tamano];
        this.cantidadFichas = new int[tamano];
        this.lector = new Scanner(System.in);
    }

    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void jugar() {
        char simbolo = turno1 ? simbolo_Jugador_1 : simbolo_Jugador_2;
        System.out.println("Ingresa tu posición");
        int x = lector.nextInt();
        int y = tamano - 1 - cantidadFichas[x];
        cantidadFichas[x] += 1;
        matriz[y][x] = simbolo;
        turno1 = !turno1;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public int getTamano() {
        return tamano;
    }

    public char getSimbolo_Jugador_1() {
        return simbolo_Jugador_1;
    }

    public char getSimbolo_Jugador_2() {
        return simbolo_Jugador_2;
    }

    public boolean getTurno1() {
        return turno1;
    }

    public void setTurno1(boolean turno1) {
        turno1 = turno1;
    }
}
