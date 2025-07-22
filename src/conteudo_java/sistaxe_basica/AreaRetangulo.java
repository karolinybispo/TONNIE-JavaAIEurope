package conteudo_java.sistaxe_basica;

import java.util.Scanner;

public class AreaRetangulo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("escreva a base do retangulo");
            int baseRetangulo = scanner.nextInt();

            System.out.println("escreva a altura retangulo");
            int alturaRetangulo = scanner.nextInt();

            int areaRetangulo = baseRetangulo * alturaRetangulo;
            System.out.println(areaRetangulo + ": essa é a área do retângulo");
        }
}
