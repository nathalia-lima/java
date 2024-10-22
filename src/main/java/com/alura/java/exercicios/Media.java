package com.alura.java.exercicios;

public class Media {
    public static void main(String[] args){
        double nota1 = 8.5;
        int nota2 = 9;
        int media = (int) (nota1 + nota2) /2;
        System.out.println(media);

        char letra = 'a';
        String palavra = "Letra";
        String frase = letra + palavra;
        System.out.println(frase);


        double precoProduto = 10.5;
        int quantidade = 5;
        double valortotal = precoProduto * quantidade;
        System.out.println(valortotal);

        double valorDolares = 32.5;
        double real = valorDolares * 4.94;
        System.out.println(real);

        double precoOriginal = 123.4;
        double desconto = 0.1;
        double total = + precoOriginal - (precoOriginal * desconto) ;
        System.out.println(total);




    }
}
