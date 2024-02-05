package entities;

import java.util.ArrayList;

import excecao.AgendaCheiaException;
import excecao.ContatoNaoExisteException;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();
    private static final int CAPACIDADE_MAXIMA = 10;

    public void addContato(Contato contato) throws AgendaCheiaException {

        if (contatos.size() < CAPACIDADE_MAXIMA) {
            contatos.add(contato);
        } else {

            throw new AgendaCheiaException("A agenda está cheia. Não é possível adicionar mais contatos.");
        }

    }

    public Contato consultarCtt(int identificador) throws ContatoNaoExisteException {

        for (Contato contato : contatos) {

            if (contato.getIdentificador() == identificador) {
                return contato;
            }
        }
        throw new ContatoNaoExisteException("Contato não encontrado na agenda.");

    }
}