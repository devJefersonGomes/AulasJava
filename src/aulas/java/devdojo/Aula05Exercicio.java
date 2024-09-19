package aulas.java.devdojo;

public class Aula05Exercicio {
    public static void main(String[] args) {
        double salario = 1500;
        double casoUm = 9.7/100;
        double casoDois = 37.35/100;
        double casoTreis = 49.50/100;
        double resultado ;
        if (salario<=34712 ){
            salario = casoUm*salario;
        }else if(salario >=34713&& salario <=68507){
            salario = casoDois*salario;

        }else if(salario >=68508){
            salario = casoTreis*salario;
        }
        System.out.println(salario);
//
    }
}
