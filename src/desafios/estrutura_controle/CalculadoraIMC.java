package desafios.estrutura_controle;
import java.util.Scanner;

public class CalculadoraIMC {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bem vindo a calculadora que ira medir IMC");

            System.out.println("Por favor, insira seu peso: ");
            float peso = scanner.nextFloat();

            System.out.println("Insira sua altura com ',: ");
            float altura = scanner.nextFloat();

            scanner.close();

            float imc = peso / (altura * altura);

            if (imc <= 18.5){
                System.out.println("Resultado: abaixo do peso!");
            }
            else if(imc >= 18.6 && imc <=24.9){
                System.out.println("Resultado: peso ideal");
            } else if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("Resultado: levemente acima do peso");
            } else if (imc >=30.0 && imc <=34.9) {
                System.out.println("Resultado: obesidade grau I ");
            } else if (imc >= 35.0 && imc <=39.9) {
                System.out.println("Resultado: obesidade grau II (SEVERA) ");
            }
            else {
                System.out.println("Obesidade III (MÓRBIDA)");
            }

        }
}
