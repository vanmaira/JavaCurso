import java.util.Scanner;

public class Loops {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        /*
        //FOR
        for(int cont = 0; cont < 10; cont++){
            System.out.println("Vanessinha " + cont);
        }
        */

        /*
        //WHILE
        
        int cont = 0;
        

        System.out.print("Digite o maximo");
        int max = scan.nextInt();

        while(cont < max){
            System.out.println("Vanessinha " + cont);
            cont++;
        }
        */

        // DO WHILE

        int cont = 0;
        do{
            System.out.println(cont + " vaaaai");
            cont++;

        } while (cont <= 5);


    }
    
}
