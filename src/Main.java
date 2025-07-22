//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println();

        /* O args armazena variaveis, ela é uma lista.
        Eu passo os argumentos no terminal aos args declarados: java src/Main.java OI Dia.
        É possivel rodar o programa diretamente no run, mas para isso é necessario configurar o 'edit configuration' do Run.
        */

        String msg = "Programando ";
        System.out.println(msg + args[0]);
        System.out.println("argumento 2: " + args[1]);



    }
}