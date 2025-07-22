package conteudo_java.sistaxe_basica;

import java.util.Scanner;

public class AreaQuadrado {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("escreva o lado do quadrado");
            int ladoQuadrado = scanner.nextInt();

            int areaQuadrado = ladoQuadrado * ladoQuadrado;

            System.out.println("Area do quadrado: " + areaQuadrado);
        }
}
