public class Heranca {
    public static void main(String[] args){
        //ver Carro.java

        Carro c1 = new Carro("Gol");
        Carro c2 = new Carro ("HRV");
        CarroCombate c3 = new CarroCombate("Leopardo",100);
        CarroCombate c4 = new CarroCombate("Pantera",50);

        c3.atirar();
        c3.atirar();
        c3.atirar();
        c3.atirar();
        c4.sofrerDano(130);
        c1.sofrerDano(5);

        
        c1.setLigado(true);
        c1.info();
        c2.info();
        c3.info();
        c4.info();

        

    }
}//Heranca
