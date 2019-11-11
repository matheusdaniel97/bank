package br.com.fit.matheusBanco.modelo;

import java.util.Comparator;

public abstract class Conta {
    private int agencia;
    private int numero;
    protected double saldo;
    private Cliente titular;
    private static int total;

    /**
     * Construtor para iniciar a partir dos parametros
     * @param agencia
     * @param numero
     */

    public Conta(int agencia, int numero){
        total ++;
        System.out.println("Total de contas: " + total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Criando conta agencia: " + agencia);
        System.out.println("Criando conta numero: " + numero);
        System.out.println();
    }

    public abstract void deposita (double valor);

    public void saca (double valor) throws SaldoInsuficienteExcelption{
        if(valor>this.saldo){
            throw new SaldoInsuficienteExcelption("Saldo: " + this.saldo + ", Valor: " + valor);
        }
        else {
            this.saldo -= valor;
        }
    }

    public void transfere (double valor, Conta contaDestino) throws SaldoInsuficienteExcelption{
        this.saca(valor);
        contaDestino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public boolean equals(Object ref) {

        Conta outra = (Conta) ref;

        if(this.agencia!= outra.agencia)
        {
            return false;
        }

        if (this.numero!= outra.numero){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Agencia: " + getAgencia() + " -- Numero: " + getNumero();
    }

}


