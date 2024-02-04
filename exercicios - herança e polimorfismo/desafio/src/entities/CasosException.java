package entities;

public class CasosException extends Exception {


    public ContatoNaoExisteException(String mensagem) {
        super(mensagem);
    }

    public AgendaCheiaException(String mensagem) {
        super(mensagem);
    }


}
