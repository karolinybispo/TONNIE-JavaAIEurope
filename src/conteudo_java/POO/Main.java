package conteudo_java.POO;


import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Person pessoa = new Person("Paraná");
            pessoa.setName("Livia");
            pessoa.setAge(3);

            var men = new Person("Santa Catarina");
            men.setAge(10);
            men.setName("Benjamin");

            System.out.println("Menina: " + pessoa.getAge() + " tem " + pessoa.getAge() + " anos" + " é do estado: " + pessoa.getEstado());
            System.out.println("Menino: " + men.getName() + " tem " + men.getAge() + " anos" + " é do estado: " + men.getEstado());

        }
}
