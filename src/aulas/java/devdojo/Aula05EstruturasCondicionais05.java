package aulas.java.devdojo;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7, imprima se é util ou final de semana
        byte diasemana = 1;
        switch (diasemana){
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Opção inválida");

        }
        /*
         outra forma
         switch (diasemana){
         case 1:
         case 7:
         System.out.println("FDS");
         break;
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         System.out.println("Dia útil");
         break;
         }
        */
    }
}
