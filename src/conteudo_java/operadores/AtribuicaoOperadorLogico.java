package conteudo_java.sistaxe_basica.operadores;

import java.util.Scanner;

public class AtribuicaoOperadorLogico {
        public static void main(String[] args) {
            var scanner = new Scanner(System.in);

            System.out.println("Quanto é 2+2?");
            var result = scanner.nextInt();

            var isRight = result == 4;
            System.out.println("O resultado é 4, voce acertou? " + isRight);

            // 3 condicoes: || , > < , &&
            System.out.println("Quantos anos voce tem?");
            var age = scanner.nextInt();

            System.out.println("É emancipado?");
            var isEmancipated = scanner.nextBoolean();

            var canDrive = age >= 18 || (isEmancipated && age >=16 );
            System.out.printf("Voce pode dirigir? (%s)", canDrive);
        }
}
