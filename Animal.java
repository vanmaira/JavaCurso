public class Animal implements SerVivo {

    public Animal(){}

    public void mover(){}
    public void comer(int massa){}
    public void info(){
        System.out.printf("%s%n", this.vivo ? "Sim" : "Não");
    }
}
