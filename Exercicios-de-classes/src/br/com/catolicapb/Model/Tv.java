package br.com.catolicapb.Model;

public class Tv {
//    Faça um programa que simule um televisor criando-o como um objeto.
//    O usuário deve ser capaz de informar o número do canal e aumentar ou diminuir o volume.
//    Certifique-se de que o número do canal e o nível do volume permanecem dentro de faixas válidas.

    public double numeroDoCAnal;
    public int volume = 0;

    public Tv(double numeroDoCAnal){
        this.numeroDoCAnal = numeroDoCAnal;
    }

    public void aumentarVolume(int volumeDesejado){
        if (volumeDesejado >= 100){
            this.volume = volumeDesejado;
            System.out.println("Volume máximo atingido!!!");
        } else if (volumeDesejado < 100 && volumeDesejado > volume) {
            this.volume = volumeDesejado;
            System.out.println("Aumentando volume...");
        }else {
            System.out.println("Error... :(");
        }
    }

    public void dimunuirVolume(int volumeEscolhido){
        if (volumeEscolhido > 0 && volumeEscolhido < this.volume){
            this.volume = volumeEscolhido;
            System.out.println("Diminuindo volume...");
        } else {
            System.out.println("Error... :(");
        }
    }
}
