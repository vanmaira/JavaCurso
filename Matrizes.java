import java.security.SecureRandom;

public class Matrizes {
    public static void main(String[] args){

        final int linhas = 3;
        final int colunas = 5;

        int[][] numeros = new int[linhas][colunas];

        int[][] num = {{1,2,3,4,5}, {1,2,3,4,5}, {1,2,3,4,5}};

        for(int l = 0; l < linhas; l++){
            for (int c = 0; c < colunas; c++){
                numeros[l][c] = new SecureRandom().nextInt(100);
            }
        }

        /*
        for(int l = 0; l < linhas; l++){
            for (int c = 0; c < colunas; c++){
                System.out.printf(" %2d |", numeros[l][c]);
            }
            System.out.println(); // pula linha pro proximo array de linhas
        }
        */

        //outra maneira mais simples para printar

        for(int[] n : numeros){
            for(int v : n){
                System.out.printf("%2d |", v);
            }
            System.out.println();
        }

        for (int[] nn : num){
            for (int vv : nn){
                System.out.printf("%3d| ",vv);
            }
            System.out.println();           
        }





        

    }
    
}
