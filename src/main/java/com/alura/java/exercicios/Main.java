package com.alura.java.exercicios;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Screen Match");

        System.out.println("Filme: Elementos");

        int year = 2022;
        System.out.println("Ano de lançamento: " + year);

        boolean planIncluse = true;
        double stars = 4.5;

        String sinopse;

        sinopse = """
                info toda em apenas um sout
                """;

        /*
        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        String nome = "João";
        int aulas = 4;

        String mensagem = """
                          Olá, %s!
                          Teremos %d aulas!
                          """.formatted(nome, aulas);

        System.out.println(mensagem);

         */

        int stars2 = (int) stars;

        if (year >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }




        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
            case 2:
                nomeDia = "segunda-feira";
                break;
            case 3:
                nomeDia = "terça-feira";
                break;
            case 4:
                nomeDia = "quarta-feira";
                break;
            case 5:
                nomeDia = "quinta-feira";
                break;
            case 6:
                nomeDia = "sexta-feira";
                break;
            case 7:
                nomeDia = "sábado";
                break;
            default:
                nomeDia = "Dia inválido";
                break;
        }

        System.out.println("O dia " + dia + " é " + nomeDia);



        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite:");
        String filme = leitura.nextLine();

        /*
            nextLine() para string;
            nextInt() para inteiro;
            nextDouble() para um valor decimal.
        */

        double mediaAvaliacao = 0;

        double nota = 0;

        /*for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme  ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }*/

        int totalDeNotas = 0;
        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para encerrar ");
            nota = leitura.nextDouble();
            if (nota != -1) {
                mediaAvaliacao +=  nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliações " + mediaAvaliacao/ totalDeNotas);
    }
}