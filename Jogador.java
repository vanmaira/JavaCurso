public class Jogador {
// ver CursoJava.java a partir linha 59

    //modificador de acesso para a variavel pode acessar de fora da classe
    //public int num = 0;

    // private só pode ser usado na classe
    private final int maxVidas = 3;
    private int num = 0;
    private int vidas = 0;
    static boolean alerta = false;
    static int qtdJogadores = 0;
    static int pontosJogadores = 0; 


    //construtor mesmo nome da classe e sem retorn
    public Jogador(int num){
        this.num = num;
        this.vidas = 1;
        System.out.printf("%nJogador número %d Criado ", num);
        qtdJogadores++;
    }
    //metodo get
    public int getVidas(){
        return this.vidas;
    }

    //metodo set
    
    public void setVidas(int vidas){
        if(vidas > maxVidas){
            this.vidas = maxVidas;
        }else if (vidas < 0){
            this.vidas = 0;
        }else{
            this.vidas = vidas;
        }
    }
        

    public void addVidas(){
        if (this.vidas < maxVidas){
           this.vidas++;
        }
    }

    static void pontos(){
        pontosJogadores+=10;
    }

    public void info(){
        System.out.printf("%nJogador: %d", this.num);
        System.out.printf("%nVidas: %d", this.vidas);
        System.out.printf("%nAlerta: %s", alerta ? "Sim" : "Não");
        System.out.printf("%nJogadores: %d", qtdJogadores);
        System.out.printf("%nPontos Jogadores: %d", pontosJogadores);
        System.out.printf("%n------------------%n");


    }



    
    

        
        
    }//Jogador






    

