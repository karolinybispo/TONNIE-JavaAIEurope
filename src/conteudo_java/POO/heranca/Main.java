package conteudo_java.POO.heranca;


    public class Main {

        public static void main(String[] args) {
            Employee employee = new Employee();
            Menager menager = new Menager();


            menager.setName("Gigi");
            menager.setLogin("linda");

            System.out.println(menager.getName());
        }
}
