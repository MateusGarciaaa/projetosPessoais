import java.util.Scanner;


public class x3_userImput{

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    
    //Scanner
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine(); // nextline serve pra ler toda a mensagem, somente next le ate o primeiro espaço

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();


        imprimir("Ola " + nome); 
        imprimir("Você tem " + idade + " anos de idade");


        scanner.close();
    }

}