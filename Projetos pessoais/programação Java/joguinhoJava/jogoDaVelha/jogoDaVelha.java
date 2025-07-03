package jogoDaVelha;
import java.util.Scanner;

public class jogoDaVelha {

    public static void main(String[] args) {
        Campo[][] velha = new Campo[3][3]; // Definindo o objeto do tipo campo, uma matriz 3x3
        char simboloAtual = 'X'; // Define o simbolo atual da jogada
        boolean game = true;
        String vitoria = "";
        Scanner scan = new Scanner(System.in);

        iniciarJogo(velha);

        while (game) {
            desenhaJogo(velha);
            vitoria = verificaVitoria(velha);
            if (!vitoria.equals("")) {
                System.out.printf("Jogador %s venceu%n", vitoria);
                break;
            }
            try {
                if (verificarJogada(velha, jogar(scan, simboloAtual), simboloAtual)) {
                    // Trocar o valor da jogada pro próximo jogador
                    if (simboloAtual == 'X') {
                        simboloAtual = 'O';
                    } else {
                        simboloAtual = 'X';
                    }
                }
            } catch (Exception e) {
                System.out.println("Erro na jogada.");
            }
        }

        System.out.println("Fim do jogo");
        scan.close();
    }

    public static boolean verificarJogada(Campo[][] velha, int p[], char simboloAtual) {
        if (velha[p[0]][p[1]].getSimbolo() == ' ') {
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        } else {
            System.out.println("Campo já ocupado! Escolha outro.");
            return false;
        }
    }

    public static void desenhaJogo(Campo[][] velha) {
        limparTela();
        System.out.println("    0   1   2");
        for (int l = 0; l < 3; l++) {
            System.out.printf("%d   %c | %c | %c %n", l,
                    velha[l][0].getSimbolo(), velha[l][1].getSimbolo(), velha[l][2].getSimbolo());
            if (l < 2) System.out.println("   -----------");
        }
    }

    public static int[] jogar(Scanner scan, char sa) {
        int p[] = new int[2];
        System.out.printf("Quem joga: %c%n", sa);
        System.out.print("Informe a linha: ");
        p[0] = scan.nextInt();
        System.out.print("Informe a coluna: ");
        p[1] = scan.nextInt();
        return p;
    }

    public static void limparTela() {
        for (int cont = 0; cont < 20; cont++) {
            System.out.println();
        }
    }

    public static void iniciarJogo(Campo[][] velha) {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                velha[l][c] = new Campo();
            }
        }
    }

    public static String verificaVitoria(Campo[][] velha) {
        // Verificar linhas
        for (int l = 0; l < 3; l++) {
            if (velha[l][0].getSimbolo() != ' ' &&
                velha[l][0].getSimbolo() == velha[l][1].getSimbolo() &&
                velha[l][1].getSimbolo() == velha[l][2].getSimbolo()) {
                return String.valueOf(velha[l][0].getSimbolo());
            }
        }

        // Verificar colunas
        for (int c = 0; c < 3; c++) {
            if (velha[0][c].getSimbolo() != ' ' &&
                velha[0][c].getSimbolo() == velha[1][c].getSimbolo() &&
                velha[1][c].getSimbolo() == velha[2][c].getSimbolo()) {
                return String.valueOf(velha[0][c].getSimbolo());
            }
        }

        // Verificar diagonal principal
        if (velha[0][0].getSimbolo() != ' ' &&
            velha[0][0].getSimbolo() == velha[1][1].getSimbolo() &&
            velha[1][1].getSimbolo() == velha[2][2].getSimbolo()) {
            return String.valueOf(velha[0][0].getSimbolo());
        }

        // Verificar diagonal secundária
        if (velha[0][2].getSimbolo() != ' ' &&
            velha[0][2].getSimbolo() == velha[1][1].getSimbolo() &&
            velha[1][1].getSimbolo() == velha[2][0].getSimbolo()) {
            return String.valueOf(velha[0][2].getSimbolo());
        }

        // Sem vencedor
        return "";
    }

}
