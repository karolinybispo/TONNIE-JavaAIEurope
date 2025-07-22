package conteudo_java.estrutura_repeticao_dowhile;


import java.util.Scanner;

public class RepeticaoDoWhile {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            var name = "";

            do {
                System.out.println("informe seu nome");
                name = scanner.next();

            } while (!name.equalsIgnoreCase("exit"));
        }
}
