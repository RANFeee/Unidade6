package Unidade6;

import java.util.Scanner;

public class Uni6Exe1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] valores = new int[10];
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("informa valor positivo:");
            valores [i] = teclado.nextInt();
        }
        System.out.println("mostrar em ordens inversa");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.printf("valor da posiçao %d: %d%n",i , valores[i]  );
        }
        teclado.close();
    }
}
