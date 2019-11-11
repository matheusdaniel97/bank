package br.com.fit.matheusBanco.program;

import br.com.fit.matheusBanco.modelo.Conta;
import br.com.fit.matheusBanco.modelo.ContaCorrente;
import br.com.fit.matheusBanco.modelo.ContaPoupanca;

public class TestOb {

    public static void main(String[] args) {
        Conta corrente = new ContaCorrente(222,333);
        System.out.println();
        Conta poupanca = new ContaPoupanca(444, 555);
        System.out.println();
        System.out.println(corrente);
        System.out.println(poupanca);
    }
}
