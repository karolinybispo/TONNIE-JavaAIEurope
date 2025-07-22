package desafios.estrutura_controle;


import java.util.Scanner;

public class SequenciaNumeros {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe um numero");
            int numeroInicial = scanner.nextInt();

            while(true){
                System.out.println("digite um numero");
                int numero = scanner.nextInt();

                //ignora numeros menores
                if(numero<numeroInicial){
                    System.out.println("numero ignorado -menor que numero inical-");
                    continue;
                }

                //verifica de eh divisivel
                if (numero % numeroInicial != 0){
                    System.out.println("numero nao divisivel por " + numeroInicial + " programa encerrado!");
                    break;
                }

                System.out.println(numero + " eh divisivel por " + numeroInicial);
            }
            scanner.close();
        }
}
