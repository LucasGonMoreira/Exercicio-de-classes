package br.com.catolicapb.Main;

import br.com.catolicapb.Model.Bola;
import br.com.catolicapb.Model.Pessoa;
import br.com.catolicapb.Model.Quadrado;

public class Main {
    public static void main(String[] args) {
//        Bola bola = new Bola(
//                "Preto",
//                6.0,
//                "Borracha"
//        );
//
//        bola.trocarCor("verde");
//        System.out.println(bola);
//
//        Quadrado quadrado = new Quadrado("10");
//        System.out.println("Tamanho inicial "+quadrado);
//        quadrado.mudarTamanhoDoLado("22");
//        System.out.println("Mudou o tamanho"+quadrado);
//        quadrado.retomarTamanhoDoLado();
//        System.out.println("tamanho novo" + quadrado);

        Pessoa pessoa = new Pessoa(
                "Lucas",
                19,
                58.0,
                1.70
        );

        System.out.println(pessoa);
        pessoa.envelhecer(1);
        System.out.println(pessoa);
        pessoa.engordar(1);
        System.out.println(pessoa);
        pessoa.emagrecer(2);
        System.out.println(pessoa);
        pessoa.crescer(1.86);
        System.out.println(pessoa);


    }
}
