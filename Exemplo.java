package Unidade6;

public class Exemplo {
    public static void main(String[] args) {
        int [] valores = new int[10];
        String [] nomes = {"rafael" , "joao",  "quadrado"};
        float [] notas = {10.2f};
        nomes [1] = "danton";

        for(int i = 0; i < nomes.length; i ++){

            System.out.println(nomes[i]);
        }
        for (float nota : notas) {
            System.out.println(nota);
        }
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
