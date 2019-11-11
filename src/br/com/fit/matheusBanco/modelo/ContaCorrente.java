package br.com.fit.matheusBanco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public void saca(double valor) throws SaldoInsuficienteExcelption{
        double valorsacar = valor +0.2;
        super.saca(valorsacar);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

    @Override
    public String toString() {
        return "Conta corrente: " + super.toString();
    }
}
