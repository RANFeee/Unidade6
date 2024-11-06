package Unidade6;

public class ExemploOrdenacao {
    public ExemploOrdenacao() {
        int [] valores = {10, 5 , 7, 14, 21, 17, 8, 100, 15};
        mostrarVetor(valores);
        ordenarVetor(valores);
        mostrarVetor(valores);
    }
    private void mostrarVetor(int [] vator) {
        for (int valor : vator) {
            System.out.printf("%d ", valor);
        }
        System.out.println(" ");
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
    public static void main(String[] args) {
        new ExemploOrdenacao();
    }
}
