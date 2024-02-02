public class Conta {
    Pessoa Titular;
    int agencia;

    int numero;
    double saldo;

    public Conta(Pessoa titular, int agencia, int numero, double saldo){
        this.Titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor menor que zero");
        } else {
            saldo += valor;
        }
    }
        public void sacar(double valor){
        if (this.saldo < valor){
            throw new IllegalArgumentException("Valor maior que o saldo disponivel");
        }else{
            saldo -= valor;
        }
    }

    public void transferir(double valor, Conta destino){
        if (this.saldo < valor){
            throw new IllegalArgumentException("Valor menor queo saldo disponivel");
        }else{
            destino.depositar(valor);
            this.sacar(valor);
        }
    }
}
