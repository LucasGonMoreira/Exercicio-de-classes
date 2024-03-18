package br.com.catolicapb.Model;

public class Bola {
    public String cor;
    public double circunferencia;
    public String material;

    public Bola(
            String cor,
            double circunferencia,
            String material
    ){
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    public String trocarCor(String corNova){
        this.cor = corNova;
        return corNova;

    }

    public void mostrarCor(){
        System.out.println(this.cor);
    }

    @Override
    public String toString() {
        return "Bola{" +
                "cor='" + cor + '\'' +
                ", circunferencia=" + circunferencia +
                ", material='" + material + '\'' +
                '}';
    }
}
