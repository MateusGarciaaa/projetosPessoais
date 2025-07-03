import java.util.Scanner;

public class Ex_2_impares{
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static int lerValorInteiro(){
        int valor = 0;
        valor = tecladoScanner.nextInt();
        return valor;
    }

    public static void processar(){
        int inicio = 0;
        int fim = 0;

        imprimir("Qual e o valor de inicio?");
        inicio = lerValorInteiro();
        imprimir("Qual e o valor de fim?");
        fim = lerValorInteiro();
        imprimir("\nOs valores impares sao:");    
        for(int i = inicio; i <= fim; i++){        
            if (i%2==1) {
                imprimir("" + i);                
            }
        }


    }
    public static void main(String[] args) {
        processar();
    }


    
}