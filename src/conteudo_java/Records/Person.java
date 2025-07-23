package conteudo_java.Records;

    public record Person(String nome, int idade) {

        //para definir atributos no records, precisa colocar o 'static'
        private static String name;

        //construtor no -Records- pode ser usado na regra de negocio, para validar inf etc
        public Person{
            System.out.println("Oi");
        }
}
