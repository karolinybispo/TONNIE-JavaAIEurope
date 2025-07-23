package conteudo_java.POO;


    public class Person {

        public Person(String estado){
            this.estado = estado;
        }
        private String name;
        private int age;
        private final String estado;/* Ele so esta como final para garantir que ele nao mude apos ser definido no construtor.
                                       Um atributo com final: estou queerendo que ele seja inicializado uma unica vez e dps nao mude.
                                        Nao preciso colocar necessariamente final no atributo presente no construtor, apenas se eu quiser que ele nao mude
                                        */

        //getters e setters
        public String getEstado() {
            return estado;
        }

        public String getName(){
            return name;
        }

        public int getAge(){
            return age;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setAge(int age){
            this.age = age;
        }


    }
