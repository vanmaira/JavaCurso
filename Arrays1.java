import java.util.Arrays;
import java.util.Scanner;

public class Arrays1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        /*

        int[] num = new int[5];
        int[] numeros = {10, 20, 30, 40, 50, 60, 70};
        final int tam = 5;
        int[] nume = new int[tam];
        
        num[0] = 10;
        num[1] = 9;
        num[2] = 8;
        num[3] = 7;
        num[4] = 6;

        for(int i = 0; i < numeros.length; i++){
            System.out.printf("%d - ", numeros[i]);
        }

        System.out.printf("%n%d%n", num[4]);
        System.out.printf("%d", numeros[3]);

        */

        /*

        final int tam = 5;
        char[] gabarito = {'a', 'a', 'd', 'b', 'c'};
        char[] respostas = new char[tam];
        int nota = 0;
        

        for (int i = 0; i < tam; i++){
            System.out.printf("Informe a resposta %d: ", i);
            respostas[i] = scan.nextLine().charAt(0);

        }

        for (int i = 0; i < tam; i++){
            if (respostas[i] == gabarito[i]){
                nota++;
            }
        }

        System.out.printf("%nNota do aluno: %d", nota);
        */
        final int tam = 10;
        int[] num = {10, 20, 30, 40, 50, 9, 8, 3, 5, 0};
        int[] numeros = new int[tam];
        int p = 3;
        int pos;

        //Arrays.sort(num); //organiza os elementos do array em ordem crescente

        //Arrays.fill(numeros, 10); //preenche todos os indexes com o valor

        //System.arraycopy(num, 0, numeros, 0, tam); // copia um array para outro

        // Arrays.equals(num, numeros); //compara dois arrays

        // System.out.printf("Arrays são iguais? %s", Arrays.equals(num, numeros) ? "Sim" : "Não");

        Arrays.sort(num);
        pos = Arrays.binarySearch(num, p);
        System.out.printf("O elemento %d está no array na posição %d? %s", p,pos, pos > 0 ? "Sim" : "Não" );

        // maneira mais simples para LER os elementos:
        System.out.println();
        for (int n: numeros){
            System.out.printf("%d -", n);
        }



        

    }
}