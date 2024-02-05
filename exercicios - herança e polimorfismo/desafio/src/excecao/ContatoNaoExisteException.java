package excecao;

public class ContatoNaoExisteException extends Exception {
    public ContatoNaoExisteException(String mensagem) {
        super(mensagem);
    }
}
