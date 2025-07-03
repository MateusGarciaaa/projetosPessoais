package jogoDaVelha;

/**
 * FUNÇÃO
 * Esse arquivo vai conferir se o campo selecionado no jogo da velha
 * está disponivel para ser selecionado.
 * Caso esteja disponivel, devera conferir de quem é a vez e colocar a
 * jogada da vez.
 */

public class Campo {
    private char simbolo;
    public Campo() {
        this.simbolo = ' ';
    
    }

    public char getSimbolo(){
        return this.simbolo;
    }

    public void setSimbolo(char simbolo){
        if (this.simbolo == ' ') {
            this.simbolo =  simbolo;
        }else{
            System.out.print("Campo ja utilizado");
        }
    }


}
