package br.com.fit.matheusBanco.program;

import br.com.fit.matheusBanco.modelo.ContaCorrente;

public class ArrayReferencia {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente conta1 = new ContaCorrente(222,555);
        contas[0] = conta1;

        ContaCorrente conta2 = new ContaCorrente(333,777);
        contas[1] = conta2;

        System.out.println(contas[0]);
        System.out.println(contas[1]);

    }
}
