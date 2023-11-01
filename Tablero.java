import java.util.Scanner;
public class Tablero {

        private int TAMANO;
        private char Simbolo_Jugador_1;
        private char Simbolo_Jugador_2;
        private boolean Turno1;
        private char[][] matriz;
        private int[] cantidadFichas;
        private Scanner lector;

        public Tablero(int tamano, char simboloJugador1, char simboloJugador2) {
            this.TAMANO = tamano;
            this.Simbolo_Jugador_1 = simboloJugador1;
            this.Simbolo_Jugador_2 = simboloJugador2;
            this.Turno1 = true;
            this.matriz = new char[TAMANO][TAMANO];
            this.cantidadFichas = new int[TAMANO];
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
            while (true) {
                char simbolo = Simbolo_Jugador_1;
                if (!Turno1)
                    simbolo = Simbolo_Jugador_2;
                System.out.println("Ingresa tu posición");
                int x = lector.nextInt();
                int y = TAMANO - 1 - cantidadFichas[x];
                cantidadFichas[x] += 1;
                matriz[y][x] = simbolo;

                imprimirMatriz();
                Turno1 = !Turno1;
            }
        }
    }


