package Unidade6;

import java.util.Scanner;

public class MetodoSemStatic {

    public MetodoSemStatic(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("informe um numero bixao");
        int tamanho = teclado.nextInt();
        int [] valores = leVetor(tamanho,teclado);
        mostraInversoVetor(valores);
    }
     public int [] leVetor(int tamanho, Scanner tec) {
        int [] valores = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("informe valor %d: ", i);
            valores[i] = tec.nextInt();
        }
        return valores;
    }

    public void mostraInversoVetor(int [] vetor){
        System.out.print("[");
        for (int i = vetor.length -1; i >= 0; i--) {
            System.out.printf("%d, ", vetor[i]);
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        new MetodoSemStatic();
    }
}
