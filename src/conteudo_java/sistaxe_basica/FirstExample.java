import java.util.Scanner;

public class FirstExample {

        public static void main(String[] args) {

            //Declarando variavel:
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hello Word. Informe seu nome");
            String name = scanner.next();

            System.out.println("Informe sua idade: ");
            int age = scanner.nextInt();

            System.out.println("Oi " + name + " voce tem " + age + " anos");
        }
}
