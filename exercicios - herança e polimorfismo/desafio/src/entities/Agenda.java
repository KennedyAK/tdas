package entities;

import java.util.ArrayList;
import entities.CasosException;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<>();
    private static final int CAPACIDADE_MAXIMA = 10;

    private CasosException casosE;

    public void addContato(Contato contato) throws CasosException {

        if (contatos.size() < CAPACIDADE_MAXIMA) {
            contatos.add(contato);
        } else {
            throw new CasosException("A agenda está cheia. Não é possível adicionar mais contatos.");
        }

    }

    public Contato consultarCtt(int identificador) throws CasosException {

        for (Contato contato : contatos) {

            if (contato.getIdentificador() == identificador) {
                return contato;
            } else {
                throw new casosE.ContatoNaoExisteException("Contato não encontrado na agenda.");
            }

        }
        return null;
    }
}