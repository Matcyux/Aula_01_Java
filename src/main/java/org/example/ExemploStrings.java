package org.example;
import javax.swing.*;
public class ExemploStrings {
    public static void main(String[] args) {
        String msg = JOptionPane.showInputDialog("Apenas digite e não questione:");
        int contador = 0;
        int contadorVogal = 0;
        System.out.println(msg);
        int ultimaPosicao = msg.length() - 1;
        for (int i = 0; i <= ultimaPosicao; i++) {
            if (msg.charAt(i) != ' '){
                contador++;
            }
            if (msg.toUpperCase().charAt(i) == 'A'||
                    msg.toUpperCase().charAt(i) == 'E'||
                    msg.toUpperCase().charAt(i) == 'I'||
                    msg.toUpperCase().charAt(i) == 'O'||
                    msg.toUpperCase().charAt(i) == 'U'){
                contadorVogal++;
            }
        }
        System.out.println("A mensagem tem: " + contador);
        System.out.println("A mensagem tem: " + contadorVogal + " vogais");
        System.out.println(msg.replace(" ", "*"));
    }
}
