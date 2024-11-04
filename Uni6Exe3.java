package Unidade6;

import java.util.Scanner;

public class Uni6Exe3 {

    private double [] lervalores(int tamanho){
        Scanner teclado = new Scanner(System.in);
        System.out.println("leitura do vetor");
        double [] vetor = new double[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("posiçao %d: ", i);
            vetor[i] = teclado.nextDouble();
        }
        return vetor;
    }
    private void alterarvalores(double [] vetor){
        for (int i = 0; i < vetor.length; i++) {
            vetor [i] *= (i % 2 == 0) ? 1.02 : 1.05;
        }
    }
    private void mostrarvalores(double [] vetor){
        System.out.print("[ ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.2f " , vetor[i]);
        }
        System.out.println("]");
    }

    public Uni6Exe3(){
        double [] valores = lervalores(5);
        mostrarvalores(valores);
        alterarvalores(valores);
        mostrarvalores(valores);
    }
    public static void main(String[] args) {
        new Uni6Exe3();
    
    }
}
