package conteudo_java.estrutura_repeticao_for;


import java.util.Scanner;

public class RepeticaoFor {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            //No for uma variavel precisa ser declarada para controlar o fluxo dessa repeticao. No segundo, declara-se quando laço/for, termina. No terceiro, dizemos como ele incrementa ou decrementa
            for (int i = 0; i < 8; i++){
                System.out.println("Digite seu nome: ");
                String name = scanner.next();

                if(name.equalsIgnoreCase("exit")) break; // ao digitar o 'exit', o fluxo quebra.

                System.out.println(name);

            }

            for (int i = 0; i<=100; i++){
                if (i % 2 == 0) {
                    continue;
                }

                System.out.println(i);
            }


        }
}
