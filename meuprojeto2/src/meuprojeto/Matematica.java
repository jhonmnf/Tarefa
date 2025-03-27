package meuprojeto;

import java.util.Scanner;

public class Matematica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número, por favor: ");
        double numero1 = teclado.nextDouble();

        System.out.println("Digite outro número, por favor: ");
        double numero2 = teclado.nextDouble();

        System.out.println("A soma dos números é: " + soma(numero1, numero2));
        System.out.println("A multiplicação dos números é: " + multiplicacao(numero1, numero2));
        System.out.println("A divisão dos números é: " + divisao(numero1, numero2));
        System.out.println("A subtração dos números é: " + subtracao(numero1, numero2));

        teclado.close();}

    public static double soma(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double multiplicacao(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double divisao(double numero1, double numero2) {
        if (numero2 == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0; 
        }
        return numero1 / numero2;
    }

    public static double subtracao(double numero1, double numero2) {
        return numero1 - numero2;
    }
}