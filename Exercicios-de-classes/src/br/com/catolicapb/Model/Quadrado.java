package br.com.catolicapb.Model;

public class Quadrado {
    public String tamanhoDoLado;

    public String tamanhoInicial;

    public Quadrado(
            String tamanhoDoLado
    ){
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public void mudarTamanhoDoLado(String tamanhoNovo){

        this.tamanhoInicial = this.tamanhoDoLado;

        this.tamanhoDoLado = tamanhoNovo;
    }

    public void retomarTamanhoDoLado(){
        this.tamanhoDoLado = this.tamanhoInicial;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "tamanhoDoLado='" + tamanhoDoLado + '\'' +
                '}';
    }
}
