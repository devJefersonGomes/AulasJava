package aulas.java.devdojo;

public class Aula06EstruturasDeRepetição02 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000
        long countPar = 0;
       while (countPar <= 1000000){
           System.out.println(countPar);
           countPar += 2;
       }

        //for (countPar=0; countPar<= 1000000;countPar = +2 ){
       //     System.out.println(countPar);
       // }
    }
}
