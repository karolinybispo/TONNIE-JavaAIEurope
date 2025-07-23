package conteudo_java.POO;


import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Person pessoa = new Person();
            pessoa.name = "Livia";
            pessoa.age = 3;

            var men = new Person();
            men.age = 10;
            men.name = "benjamin";

            System.out.println("Menina: " + pessoa.name + " tem " + pessoa.age + " anos");
            System.out.println("Menino: " + men.name + " tem " + men.age + " anos");

        }
}
