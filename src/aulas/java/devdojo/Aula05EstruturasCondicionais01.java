package aulas.java.devdojo;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        if (true){
            System.out.println("dentro do if");
        }
        System.out.println("fora do if");

        int maiorDeIdade = 20;
        boolean emaior = maiorDeIdade >= 21;
        if (emaior) {
            System.out.println("tá liberado moleque");
        }
        else {
            System.out.println("sai daqui rapa");
        }

    }
}
