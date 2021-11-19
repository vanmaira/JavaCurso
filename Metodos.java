public class Metodos {
    public static void main(String[] args){

        canal();

        for(int i = 0; i < 4; i++){
            canal();
        }

        msg("Metodo com parametro");
        msg("cada chamada pode ter um valor");
        msg("posso chamar quantas vezes quiser");

        msg2("oieee", 3);

        int r;
        r = soma(10,5);
        System.out.println(r);

        System.out.println(soma(2,2));


        System.out.println(somaVarios(2,10,3,5));
        System.out.println(somaVarios(5,55,5,5,5,5,5));

        System.out.println(soma(2.5, 3.2));





    }

    //parametros de entrada

    public static void canal(){
        System.out.println("Vanessinha");
    }

    public static void msg(String m){
        System.out.println(m);
    }

    public static void msg2(String m, int l){
        for (int i = 0; i < l; i++){
            System.out.println(m);
        }        
    }

    //parametros de saida

    public static int soma(int n1, int n2){
        int res = n1 + n2;
        return res;
    }

    public static int somaVarios(int...numeros){
        int resposta = 0;
        for (int n : numeros){
            resposta += n;
        }
        return resposta;
    }

    //sobrecarga de metodos (mesmo nome do metodo, mas com parametros diferentes)
    public static double soma(double ...numeros){
        double resposta = 0;
        for (double n : numeros){
            resposta += n;
        }
        return resposta;
    }


    
}
