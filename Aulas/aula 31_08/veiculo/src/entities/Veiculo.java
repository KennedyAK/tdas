package entities;

//classe de um veiculo generico
public abstract class Veiculo {

    //indica se o veiculo esta ligado ou nao
    private boolean ligado;

    //metodo get do atributo ligado
    public boolean isLigado() {
        return ligado;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }
}
