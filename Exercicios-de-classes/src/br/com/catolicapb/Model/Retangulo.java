package br.com.catolicapb.Model;

public class Retangulo {
    //Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher)
    //Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro;
    //Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as medidades de um local.
    // Depois, deve criar um objeto com as medidas e calcular a quantidade de pisos e de rodapés necessárias para o local.

    public double base;
    public double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public void mudarValorDosLados(double baseNova, double alturaNova){
        this.base = baseNova;
        this.altura = alturaNova;
    }

    public double calcularArea(){
        double area = this.base * this.altura;
        return area;
    }

    public double perimetro(){
        double peri = 2*(this.altura * this.base);
        return peri;
    }
}
