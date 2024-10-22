package com.alura.java.exercicios;

import java.util.Scanner;

public class Cacluladora {
    public static void main(String[] args) {
        System.out.println("Digite um número");
        Scanner scan = new Scanner(System.in);
        double numero = scan.nextDouble();

        System.out.println(Dobro(numero));
    }

    public static double Dobro(double numero){
        return numero*2;
    }
}
