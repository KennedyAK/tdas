package entities;

public  class Contato {

    private String nome;
    private int tel;
    private int identificador;

    public String getNome() {
        return nome;
    }

    public int getTel() {
        return tel;
    }

    public int getIdentificador() {
        return identificador;
    }

    public Contato(String nome, int tel, int idtt) {
        this.nome = nome;
        this.tel = tel;
        this.identificador = idtt;
    }


}
