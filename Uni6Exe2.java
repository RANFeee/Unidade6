package Unidade6;

import java.util.Scanner;

public class Uni6Exe2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double [] valores = new double[12];
        for (int i = 0; i < valores.length; i++) {
            System.out.print("informe valor:");
            valores[i] = teclado.nextDouble();
        }
        double acumuladores = 0;
        for (double valor : valores) {
            acumuladores += valor;            
        }
        double media = acumuladores / valores.length;
        

        for (double valor : valores) {
            System.out.printf("%s", valor > media ? String.format(" valor: %f", valor):"");
        }
        teclado.close();
    }
}
