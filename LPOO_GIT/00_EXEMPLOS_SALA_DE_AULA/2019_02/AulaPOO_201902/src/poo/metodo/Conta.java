package poo.metodo;

public class Conta {

    public int numero;
    public String nomeCliente;
    public double saldo;

    public Conta(int numero, String nomeCliente, double saldo) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    
    public boolean sacar(double valor){
        if(this.saldo < valor){
            return false;
        }else{
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
    public boolean depositar(double valor){
        if(valor <= 0){
            return false;
        }else{
            this.saldo = this.saldo + valor;
            return true;
        }
    }
    
}
