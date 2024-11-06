package Unidade6;

import java.util.Scanner;

import Unidade_5.dowhile;

public class Uni6Exe7 {
    private Scanner teclado = new Scanner(System.in);
    public Uni6Exe7(){
        int  tamanho = lerInteiro(1, 20);
        int [] valores = levetor(tamanho);
        mostrarVetor(valores);
        ordenarVetor(valores);
        mostrarVetor(valores);
       
    }
    private void ordenarVetor(int [] vetor) {
        for (int i = 0; i < vetor.length -1; i++) {
            for(int j = 0; j<vetor.length -1; j++){
                if(vetor[j] > vetor[j + 1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }
    private void mostrarVetor(int [] vator) {
        for (int valor : vator) {
            System.out.printf("%2d ", valor);
        }
        System.out.println("");
    }
    private int [] levetor (int tamanho){
        int [] vetor = new int[tamanho]; 
        int valor = 0;
        int vetorPos = 0;
      
        while (vetorPos < vetor.length) {
            System.out.printf("posiçao %d: ", vetorPos);
            valor = lerInteiro(Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (!pesquisaValor(vetor, valor, vetorPos)) {
                vetor[vetorPos++] = valor;
            }
        }
        return vetor;
    }

    private boolean pesquisaValor(int []vetor, int valor, int posicao ){
        for (int i = 0; i < posicao; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }
    private int lerInteiro(int limInf, int limSup){
        
        int valor = 0;
        do {
            System.out.printf("informe numero (%d <= n <= %d) ", limInf , limSup);
            valor = teclado.nextInt();
            if (valor < limInf || valor > limSup) {
                System.out.println("erro");
            }
        } while (!(valor < limInf || valor > limSup));
        
        return valor;
    }
   
   
    public static void main(String[] args) {
        new Uni6Exe7();
    }
}
