package br.com.catolicapb.Model;

public class Quadrado {
    public double tamanhoDoLado;

    public Quadrado(
            double tamanhoDoLado
    ){
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public void mudarTamanhoDoLado(double tamanhoNovo){


        this.tamanhoDoLado = tamanhoNovo;
    }
    public double area(){
        double resultado = this.tamanhoDoLado * this.tamanhoDoLado;
        return resultado;
    }
    @Override
    public String toString() {
        return "Quadrado{" +
                "tamanhoDoLado='" + tamanhoDoLado + '\'' +
                '}';
    }
}
