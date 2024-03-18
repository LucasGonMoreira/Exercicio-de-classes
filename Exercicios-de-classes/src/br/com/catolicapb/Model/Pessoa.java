package br.com.catolicapb.Model;

public class Pessoa {
    //Atributos: nome, idade, peso e altura
    //Métodos: Envelhercer, engordar, emagrecer, crescer.
    //Obs: Por padrão, a cada ano que nossa pessoa envelhece, sendo a idade dela menor que 21 anos,
    //ela deve crescer 0,5 cm.

    public String nome;
    public int idade;
    public double peso;
    public double altura;

    public Pessoa(
            String nome,
            int idade,
            double peso,
            double altura
    ){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public void envelhecer(int quantidadeDeAnosParaEnvelhercer){
        this.idade += quantidadeDeAnosParaEnvelhercer;
        if(this.idade < 21){
            this.altura += quantidadeDeAnosParaEnvelhercer * 0.05;
        }else {

            System.out.print("");
        }

    }
    public void engordar(double quantidadeDeKgParaEngordar){
        this.peso += quantidadeDeKgParaEngordar;
    }
    public void emagrecer(double quantidadeDeKgParaEmagrecer){
        this.peso -= quantidadeDeKgParaEmagrecer;
    }
    public void crescer(double alturaQueDeseja) {
        this.altura = alturaQueDeseja;
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                "Kg, altura=" + altura +
                "m}";
    }
}
