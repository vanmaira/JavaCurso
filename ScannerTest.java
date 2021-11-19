import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int res = 0;

        System.out.print("Digite um número: ");
        n1 = scan.nextInt();
        System.out.print("Digite outro número: ");
        n2 = scan.nextInt();
        res = n1 + n2;
        System.out.printf("Soma de %d com %d é igual a %d.", n1, n2, res);
        
    }

    
}
