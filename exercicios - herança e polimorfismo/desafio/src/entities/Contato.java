package entities;

public  class Contato {

    private String nome;
    private int tel;
    private int identificador = 0;

    public String getNome() {
        return nome;
    }

    public int getTel() {
        return tel;
    }

    public int getIdentificador() {
        return identificador;
    }

    public Contato(String nome, int tel) {
        this.nome = nome;
        this.tel = tel;
        this.identificador++;
    }


}
