package br.com.fit.matheusBanco.program;
/**
 * @author: Matheus Daniel
 * @version 1.0
 */

import br.com.fit.matheusBanco.modelo.*;

public class Program {

    public static void main(String[] args) throws SaldoInsuficienteExcelption {

        ContaCorrente corrente = new ContaCorrente(111,100);
        corrente.deposita(500);

        ContaPoupanca poupanca = new ContaPoupanca(200,250);
        poupanca.deposita(600);

        System.out.println();
        System.out.println("br.com.fit.matheusBanco.modelo.Conta Corrente: " + corrente.getSaldo());
        System.out.println("br.com.fit.matheusBanco.modelo.Conta Poupanca: " + poupanca.getSaldo());

        corrente.transfere(20,poupanca);

        System.out.println();
        System.out.println("br.com.fit.matheusBanco.modelo.Conta Corrente: " + corrente.getSaldo());
        System.out.println("br.com.fit.matheusBanco.modelo.Conta Poupanca: " + poupanca.getSaldo());

        System.out.println();
        System.out.println("Sacando 10 da conta corrente");
        corrente.saca(80);
        System.out.println(corrente.getSaldo());

        poupanca.deposita(30);
        System.out.println(poupanca.getSaldo());

        System.out.println();
        System.out.println();

        //Testando Tributaveis

        ContaCorrente correntetributavel = new ContaCorrente(111, 111);
        correntetributavel.deposita(1000);
        System.out.println(correntetributavel.getValorImposto());

        SeguroDeVida sv = new SeguroDeVida();
        System.out.println(sv.getValorImposto());

        CalculadorImposto calc = new CalculadorImposto();
        calc.registra(correntetributavel);
        calc.registra(sv);

        System.out.println(calc.getTotalImposto());

        //TesteSacaComException

        Conta conta = new ContaCorrente(111, 1111);
        conta.deposita(200);
        conta.saca(190);
        System.out.println(conta.getSaldo());
    }
}
