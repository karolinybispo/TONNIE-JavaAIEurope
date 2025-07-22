package conteudo_java.sistaxe_basica;

import java.util.Scanner;

public class AnoNascimento {
        public static void main(String[] args) {

            Scanner leitor = new Scanner(System.in);

            System.out.println("Informe seu nome!: ");
            String name = leitor.next();

            System.out.println("Informe seu ano de nascimento: ");
            int years = leitor.nextInt();

            int birthday = 2025 - years;

            System.out.println("Olá " + name + " você tem " + birthday + " anos");
        }
}
