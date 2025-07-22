package conteudo_java.sistaxe_basica;

import java.util.Scanner;

public class Diferenca_Idade {

    //Recebeu nome e idade de duas pessoas e deve calcular sua diferenca de idade.

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("escreva seu nome");
            String person1 = scanner.next();

            System.out.println("escreva seu ano de nascimento");
            int year1 = scanner.nextInt();

            ////////////////////

            System.out.println("escreva seu nome");
            String person2 = scanner.next();

            System.out.println("escreva seu ano de nascimento");
            int year2 = scanner.nextInt();

            int difference = year1 - year2;
        System.out.println(person1 + " e " + person2 + " vocês tem " + difference + " anos de idade!");



        }
}
