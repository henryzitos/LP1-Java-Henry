import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Fixo controleFixo = new Fixo("Henry", 30);
        Variavel controleVariavel = new Variavel("Zitos", 31, 7);
        Lazer controleLazer = new Lazer("Henryzitos", 32, false);

        System.out.println(controleLazer.getValor());
        controleLazer.mudarValor(50.0);
        System.out.println(controleLazer.getValor());

        System.out.println(controleVariavel.getValor());
        controleVariavel.mudarValor(32.0);
        System.out.println(controleVariavel.getValor());
    }
}