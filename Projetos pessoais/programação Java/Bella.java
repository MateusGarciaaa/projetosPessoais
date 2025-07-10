import java.util.Scanner;

public class Bella {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static String lerValorString() {
        String text;
        text = tecladoScanner.nextLine();
        return text;
    }


    public static void main(String[] args) {
        String senha;
        String saida;

        imprimir("Qual é o melhor casal do mundo?(Damas Primeiro)");
        senha = lerValorString();

        if (senha.equalsIgnoreCase("Bella e Mateus")) {
            saida = "ACERTOOOUUUU";
        } else {
            saida = "EROOOUUUUUUU";
        }

        imprimir(saida);
    }

}
