package conteudo_java.estrutura_repeticao_while;


import java.util.Scanner;

public class RepeticaoWhile {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            var name = "";

            while (!name.equals("exit")){
                System.out.println("informe seu nome: ");
                name = scanner.next();
                System.out.println(name);
            }
        }
}
