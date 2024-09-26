package aulas.java.devdojo;

public class Aula06EstruturasDeRepetição04 {
    //Dado o valor de um carro, descubra quantas vezes ele pode ser parcelado
    //condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorVeiculo = 20000;
        for (int parcela = 1; parcela <= valorVeiculo; parcela++) {
            double valorParcela = valorVeiculo / parcela;
            if (valorParcela <1000) {
                break;
            }
            if (valorParcela >= 1000) {
                System.out.println("Parcela "+ parcela+ " R$ "+valorParcela);
            }

        }


    }
}
