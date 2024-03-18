package br.com.catolicapb.Model;

public class BichoVirtual {
//    Classe Bichinho Virtual:Crie uma classe que modele um Tamagushi (Bichinho Eletrônico):
//
//    Atributos: Nome, Fome, Saúde e Idade b. Métodos: Alterar Nome, Fome, Saúde e Idade;
//    Retornar Nome, Fome, Saúde e Idade Obs: Existe mais uma informação que devemos levar em consideração
//    o Humor do nosso tamagushi, este humor é uma combinação entre os atributos Fome e Saúde, ou seja, um campo calculado
//    então não devemos criar um atributo para armazenar esta informação por que ela pode ser calculada a qualquer momento.

    public String nome;
    public boolean fome;
    public double saude = 100;
    public int idade;

    public BichoVirtual(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void alterarNome(String novoNome){
        this.nome = novoNome;
    }

    public void alterarFome(boolean trueOrFalse){
        this.fome = trueOrFalse;
    }
    
    public void alterarSaude(double saudeNova){
        this.saude = saudeNova;
    }
    
    public void alterarIdade(int idadeNova){
        this.idade = idadeNova;
    }

    public void calcularHumor() {
        // Calcula o humor baseado na fome e saúde
        if (this.fome == false && this.saude >= 50) {
            System.out.println("Feliz");
        } else if (this.fome == true && this.saude >= 50) {
            System.out.println("Com Fome");
        } else if (this.fome == true && this.saude < 50) {
            System.out.println("Doente");
        } else {
            System.out.println("Triste");
        }
    }
    
    @Override
    public String toString() {
        return "BichoVirtual{" +
                "nome='" + nome + '\'' +
                ", fome=" + fome +
                ", saude=" + saude +
                ", idade=" + idade +
                '}';
    }
}
