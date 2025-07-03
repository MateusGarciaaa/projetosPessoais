import java.util.Scanner;

public class Ex_16_QuedaLivre {

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int lerValorInteiro() {
        int valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void processar() {
        int altura = 0;
        int tempo = 0;
        double velocidade = 9.8;

        imprimir("De que altura que o objeto será lançado?");
        altura = lerValorInteiro();

        if (altura <= 0) {
            imprimir("O valor digitado é inválido");
        }

        for (int i = altura; i > 0; i--) {
            if (altura <= 0) {
                imprimir("O valor digitado é inválido");
                break;
            }
            tempo = tempo + 1;
        }

        velocidade = velocidade * tempo;
        imprimir("A velocidade com que o objeto atinge o solo (dispensando a resistencia do ar) é igual à: " + velocidade + " m / s2");
    }

    public static void main(String[] args) {
        processar();
    }

}
