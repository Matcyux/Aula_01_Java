package org.example;

public class Main {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 10; i++) {
            soma = soma + i;
            System.out.println(soma);
        }

        System.out.println("===");

        int soma2 = 0;
        int j = 1;
        while (j <= 10) {
            soma2 = soma2 + j;
            System.out.println(soma2);
            j++;
        }
    }
}
