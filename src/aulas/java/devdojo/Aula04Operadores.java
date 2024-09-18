package aulas.java.devdojo;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+-/*
         int numero01 = 10;
         int numero02 = 20;
         int soma = numero02+numero01;
        System.out.println(numero01 / (double) numero02);
        System.out.println("a soma é "+soma);
        System.out.println(numero02-numero01);

        //% resto da divisão
        int resto = 20 % 2;
        System.out.println(resto);

        //< > menor e maior <= >= menor igual maior igual  == igual  != diferente
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezmaiorigualQueVinte = 10 >= 20;
        boolean isDezMenorigualVinte = 10 <= 20;
        boolean isDezigualVinte = 10 == 20;
        boolean isDezdiferenteVinte = 10 != 20;



        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezMaiorigualQueVinte "+isDezmaiorigualQueVinte);
        System.out.println("isDezMenorigualQueVinte "+isDezMenorigualVinte);
        System.out.println("isDezigualQueVinte "+isDezigualVinte);
        System.out.println("isDezdiferenteQueVinte "+isDezdiferenteVinte);

        /*operadores logicos
        && (AND)  !
        * */
        int idade = 35;
        float salario = 3550F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("Está dentro da lei? "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("Está dentro da lei? "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayCinco = 5000F;
        boolean isPlayCincoCompravel = valorTotalContaCorrente > valorPlayCinco || valorTotalContaPoupanca > valorPlayCinco;
        System.out.println("é compravel? "+isPlayCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;   //2800 somar
        bonus -= 1000;   //1800 subtrair
        bonus *= 2;      //3600 multiplicar
        bonus /= 2;      //1800 dividir
        bonus %= 2;      //0.0 resto
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;  //contador = contador +1;
        contador++;
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);





    }
}
