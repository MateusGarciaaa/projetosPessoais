public class Ex_1_mult5 {

    public static void imprimir(String texto) {
        System.out.println(texto);
    }

    public static void processar() {

        for (int i = 100; i <= 500; i++) {
            if (i % 5 == 0) {
                imprimir("" + i);
            }
        }
    }

    public static void main(String[] args) {
        processar();
    }

}
