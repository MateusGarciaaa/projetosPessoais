import java.util.Scanner;

public class execicio2recuperacao {
    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int lerValorInteiro() {
        int valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void main(String[] args) {
        int[] posicao;

        do {
            posicao = receberValorXeY();
            String saida = "";

            if (posicao[0] > 0) {
                if (posicao[1] > 0) {
                    saida = "primeiro";
                } else if (posicao[1] < 0) {
                    saida = "quarto";
                }
            } else if (posicao[0] < 0) {
                if (posicao[1] > 0) {
                    saida = "segundo";
                } else if (posicao[1] < 0 ) {
                    saida = "terceiro";
                }
            }
            if (!saida.equals("")) {
                imprimir(saida);
            }         


        }while (posicao[0] != 0 && posicao[1] != 0);
        
        
    }

    public static int[] receberValorXeY() {
        int[] posicao = new int[2];

        imprimir("Digite o valor X do ponto");
        posicao[0] = tecladoScanner.nextInt();

        imprimir("Digite o valor Y do ponto");
        posicao[1] = tecladoScanner.nextInt();

        return posicao;
    }
}
