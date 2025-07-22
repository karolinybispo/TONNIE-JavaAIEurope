package desafios.estrutura_controle;


import java.util.Scanner;

    public class Tabuada {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Insira um numero: ");
            int number = scanner.nextInt();

            for(int i = 0; i <= 10; i++){
                int result = i * number;
                System.out.println( number + "x" + i + " = " + result );
            }
        }

}
