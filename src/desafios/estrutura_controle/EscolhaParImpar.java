package desafios.estrutura_controle;

/*
Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar,
com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados,
 incluindo os números informados e em ordem decrescente;
 */


import java.util.Scanner;

public class EscolhaParImpar {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("escreva um numero: ");
            int numberOne = scanner.nextInt();

            System.out.println("insira outro numero, maior que o primeiro");
            int numberTwo = scanner.nextInt();

            // Validação do intervalo
            if (numberTwo <= numberOne) {
                System.out.println("Erro: o segundo número deve ser maior que o primeiro.");
                return;
            }

            System.out.println("Escolha 1 para 'par' e 2 para 'impar'");
            int parOuImpar = scanner.nextInt();

            System.out.println("__________");

            //Escolheu par, entra no for para passar todos os numeros pares no intervalo do numero maior (numberTwo) e em ordem decrescente
            switch (parOuImpar) {
                case 1:
                    System.out.println("Números pares: ");
                    for (int i = numberTwo; i >= 0; i--) {
                        int pares = i % 2;
                        if (pares == 0) {
                            System.out.println(i + " é par");
                        }
                    }
                    break;

                //escolheu impar, for informa todos os impares no intervalor da variavel numberTwo e em ordem decrescente
                case 2:
                    System.out.println("Entrou no case 2");
                    System.out.println("Números ímpares:");
                    for (int i = numberTwo; i >= 0; i--) {
                        if (i % 2 != 0) {
                            System.out.println(i + " é ímpar");
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Escolha 1 para par ou 2 para ímpar.");
                    break;
            }
        }
}
