package br.com.fit.matheusBanco.program;

import br.com.fit.matheusBanco.modelo.Conta;
import br.com.fit.matheusBanco.modelo.ContaCorrente;
import br.com.fit.matheusBanco.modelo.ContaPoupanca;

import java.util.ArrayList;

public class ArrayEquals {

    public static void main(String[] args) {

        ArrayList<Conta> list = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(222,333);
        list.add(cc1);

        Conta cp = new ContaPoupanca(555,888);
        list.add(cp);

        System.out.println();

        boolean existe = list.contains(cp);
        System.out.println(existe);

        for (Conta conta: list) {
            System.out.println(conta);
        }

    }
}
