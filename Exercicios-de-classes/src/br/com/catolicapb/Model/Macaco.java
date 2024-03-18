package br.com.catolicapb.Model;

public class Macaco {
//    Desenvolva uma classe Macaco,que possua os atributos nome e bucho (estomago) e pelo menos os
//    métodos comer(), verBucho() e digerir(). Faça um programa ou teste interativamente, criando pelo menos dois macacos,
//    alimentando-os com pelo menos 3 alimentos diferentes e verificando o conteúdo do estomago a cada refeição.
//    Experimente fazer com que um macaco coma o outro. É possível criar um macaco canibal?

    public String nome;
    public String bucho = "";

    public Macaco(String nome){
        this.nome = nome;
    }

    public void digerir(){
        this.bucho = "";
        System.out.println("\n Digeriu! ");
    }

    public void comer(String comida){

        this.bucho = this.bucho+comida+",";
    }

    public void verBucho(){
        System.out.printf("\nNo bucho de %s tem= %s", this.nome,this.bucho);
    }

}
