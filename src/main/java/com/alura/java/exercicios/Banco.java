package com.alura.java.exercicios;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args){
        String nome = "Cassandra Clare";
        String tipoConta = "Corrente";
        double saldo = 1299.97;

        System.out.println("*******************************");
        System.out.println("\nNome: " + nome + "\nTipo conta: " + tipoConta + "\nSaldo: " + saldo);
        System.out.println("\n*******************************");

        int opcao = 0;

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;

        Scanner scan = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            opcao = scan.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = scan.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = scan.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
