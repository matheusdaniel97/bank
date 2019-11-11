package br.com.fit.matheusBanco.program;

import br.com.fit.matheusBanco.modelo.Conta;
import br.com.fit.matheusBanco.modelo.ContaCorrente;
import br.com.fit.matheusBanco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LikedList {


    public static void main(String[] args) {

        List<Conta> list = new LinkedList<Conta>();

        Conta cc1 = new ContaCorrente(222,333);
        list.add(cc1);

        Conta cp = new ContaPoupanca(2222,3333);
        list.add(cp);

        System.out.println(list.get(0));

        System.out.println();

        for (Conta conta: list) {
            System.out.println(conta);
        }

    }
}
