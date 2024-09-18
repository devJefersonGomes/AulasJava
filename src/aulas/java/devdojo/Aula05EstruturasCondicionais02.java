package aulas.java.devdojo;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >=18 categoria adulto
        int idade = 35;
        boolean catInfantil = idade < 15;
        boolean catJuvenil = idade >= 15 && idade < 18;
        boolean catAdulto = idade >=18;

        if(catInfantil){
            System.out.println("Categoria infantil!!");
        }
        if(catJuvenil){
            System.out.println("Categoria juvenil!!");
        }//else {
           // System.out.println("Categoria adulto !!");
        //}
        if(catAdulto){
            System.out.println("Categoria adulto !!");
        }


    }
}
