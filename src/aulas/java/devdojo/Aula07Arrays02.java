package aulas.java.devdojo;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e double 0
        //char '\u0000'
        //boolean false
        //String null
        String[] nomes = new String[4];
        nomes[0] = "Marika";
        nomes[1] = "Mariko";
        nomes[2] = "Mariku";
        nomes[3] = "Marikaku";

        //for (int i = 0; i < 4; i++)
            for (int i = 0; i < nomes.length; i++)
            {
            System.out.println(nomes[i]);

        }
    }
}
