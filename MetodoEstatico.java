package Unidade6;

import java.util.Scanner;

public class MetodoEstatico {
    public static int [] leVetor(int tamanho) {
        int [] valores = new int[tamanho];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("informe valor %d: ", i);
            valores[i] = teclado.nextInt();
        }
        return valores;
    }

    public static void mostraInversoVetor(int [] vetor){
        System.out.print("[");
        for (int i = vetor.length -1; i >= 0; i--) {
            System.out.printf("%d, ", vetor[i]);
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int [] valores = leVetor(10);
        mostraInversoVetor(valores);
    }
}
