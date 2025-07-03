
import java.util.Scanner;

import java.lang.Math;

public class CalculadoraJurosCompostos {

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int lerValorInteiro() {
        int valor = tecladoScanner.nextInt();
        return valor;
    }

    public static float lerValorFloat() {
        float valor = tecladoScanner.nextFloat();
        return valor;
    }

    public static double lerValorDouble() {
        double valor = tecladoScanner.nextDouble();
        return valor;
    }

    public static String lerValorString() {
        String valor = tecladoScanner.next();
        return valor;
    }

    public static double calcular_montante_final(double p, double i, double n, double v0) {
        double montante_final;
        montante_final = (double) p * (Math.pow(1 + i, n) - 1) / i + v0 * Math.pow(1 + i, n);
        return montante_final;
    }

    public static double valorInicial() {
        double valor_inicial = 0;

        imprimir("Você já tem dinheiro investido?");
        String resposta = lerValorString();
        resposta.toLowerCase();

        if (resposta.equalsIgnoreCase("sim")) {
            imprimir("Quanto?");
            valor_inicial = lerValorDouble();
        }

        return valor_inicial;

    }

    public static double tempoEmMeses() {
        double tempo_em_meses;
        imprimir("Por quanto tempo voce irá investir?(em meses)");
        tempo_em_meses = lerValorDouble();
        return tempo_em_meses;
    }

    public static double aporte_mensal() {
        imprimir("De quanto será o aporte mensal?");
        return lerValorDouble();
    }

    public static double rendimento_mensal() {
        double rendimento_mensal;
        imprimir("Qual a taxa de juros mensal esperada?");
        rendimento_mensal = lerValorDouble();

        rendimento_mensal = (double) rendimento_mensal / 100;
        return rendimento_mensal;
    }

    public static boolean perguntaProgresso() {

        imprimir("Gostaria de ver o progresso mês à mês?");
        String resposta = lerValorString();
        resposta.toLowerCase();

        if (resposta.equalsIgnoreCase("sim")) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        double montante_final = 0;

        imprimir("\n\n#####CALCULADORA DE JUROS COMPOSTOS#####\n\n");

        double valor_inicial = valorInicial();

        double tempo_em_meses = tempoEmMeses();

        double rendimento_mensal = rendimento_mensal();

        double aporte_mensal = aporte_mensal();

        montante_final = calcular_montante_final(aporte_mensal, rendimento_mensal, tempo_em_meses, valor_inicial);

        if (perguntaProgresso()) {
            for (int i = 1; i <= tempo_em_meses; i++) {
                montante_final = calcular_montante_final(aporte_mensal, rendimento_mensal, i, valor_inicial);
                imprimir(i + "° mês: R$ " + String.format("%.2f", montante_final));
            }
        } else {
            imprimir("O valor após os " + tempo_em_meses + " meses é de: R$" + String.format("%.2f", montante_final));
        }

    }
}
