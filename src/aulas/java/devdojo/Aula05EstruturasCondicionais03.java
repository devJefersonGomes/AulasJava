package aulas.java.devdojo;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
       double salario = 1000;
       String mensagemDoar = "Eu vou doar 500 pro DevDojo";
       String mensagemNaoDoar = "Eu ainda não tenho, mais terei";
       String resultado = salario >5000 ? mensagemDoar : mensagemNaoDoar;
       //operador ternario (condição) ? verdadeiro : falso
        //               (salario>5000) (mensagemdoar) (mensagemnaodoar)
        System.out.println(resultado);

    }
}

