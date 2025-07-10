

public class x2_variaveis{
    public static void main(String[] args) {
        //  🟩   🟦   🟥

        // 🟩 Variável = conteiner reutilizável para um valor
        //                uma variavel se comporta como se fosse o valor atribuido à ela

        // 🟥 PRIMITIVO = um valor simples armazenado diretamente na memória(stack)
        // 🟦 REFERENCIA = endereço de memória(stack) que aponta para o (heap)

        // 🟥 PRIMITIVO x 🟦 REFERENCIA
        //  -----------     -----------
        //  int             String
        //  double          array
        //  char            object
        //  boolean



        // 2 Passos para criar uma variável
        // -------------------------------
        //  1. Declaração
        //  2. Atribuição



        int quantidade = 1;

        double tamanho = 18.7;
        double temperatura = -12.2;

        char nota = 'A';
        char simbolo = '!';
        char cifrao = '$';

        boolean isStudant = true;
        boolean forSale = true;
        boolean isOnline = true;


        // 🟦 REFERENCIA 
        String nome = "Mateus Garcia";
        String comida = "Pizza";
        String email = "1234aabbcc@gmail.com";
        String carro = "Koenigsegg Agera";
        String cor = "preto";

        System.out.println("Ola " + nome);
        System.out.println("Sua comida favoria é " + comida);
        System.out.println("Seu email é " + email);

        if (forSale) {
            System.out.println("Existe um " + carro + " " + cor + " à venda");
        } else {
            System.out.println("O " + carro + " nao esta à venda");

        }
        


    }
}