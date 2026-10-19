import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        // 1º) YAGO
        char [][] matriz = new char[10][10];

        //2º) SERGIO
        int vidas=10;

        //3º) DANI
        for (int f=0; f<10;f++){
            for (int c=0; c<10; c++){
                matriz[f][c]='*';
            }
        }

        char YODA='Y';//5º) ALEJANDRO
        char CASILLA_FINAL='F';//5º) ALEJANDRO
        matriz[0][0]=YODA;//5º) ALEJANDRO
        matriz[9][9]= CASILLA_FINAL;//5º) ALEJANDRO

        //6º) MARCOS Y LUIS
        int filAleatoria = aleatorio.nextInt(10);
        int columnAleatoria= aleatorio.nextInt(10);
        matriz[filAleatoria][columnAleatoria]='M';

        //7º) ALEJANDRO Y //8º) GABRIEL Y //9º) BORIS E IKER
        int cont=0;
        while (cont<=5) {
            int filAleatoria2;
            int columnAleatoria2;
            do {
                filAleatoria2 = aleatorio.nextInt(10);
                columnAleatoria2 = aleatorio.nextInt(10);
            } while (matriz[filAleatoria2][columnAleatoria2] !='*');
                matriz[filAleatoria2][columnAleatoria2] = 'P';
                cont++;
        }

        //4º) CARLOS y HÉCTOR
        for (int f=0; f<10;f++){
            for (int c=0; c<10; c++){
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }

        //º10) PABLO
        System.out.println("Tu jugador se encuentra en la casilla 0,0");
        System.out.println(" y te puedes desplazar con WASD");

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una letra: ");
        char desplazamiento = sc.next().charAt(0);

        System.out.println("La letra elegida es "+desplazamiento);

        //11ºYOEL
        int filaYoda = 0;
        int columnaYoda= 0;
        matriz[filaYoda][columnaYoda]= YODA;
        if (desplazamiento== 'D'){//SI PULSAS LA TECLA D, LA Y DE LA POSICION 0,0 SE MUEVE A 0,1
            matriz[filaYoda][columnaYoda]='*';
            columnaYoda=columnaYoda+1;
            matriz[filaYoda][columnaYoda]=YODA;
        }

        //4º) CARLOS y HÉCTOR
        for (int f=0; f<10;f++){
            for (int c=0; c<10; c++){
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }


    }
}