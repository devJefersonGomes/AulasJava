package aulas.java.devdojo;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while(count <= 10){
            System.out.println(count);
            //System.out.println(++count);

            count +=1;
            //count++;
            //count = count +1;
        }
        count = 0;
        do{
            System.out.println("mais 1");
            count = count+1;

        }while(count < 10);

        for(int i=0; i < 10; i++){
            System.out.println("For" +i);
        }
    }
}
