package pilares;



public class Carro extends Veiculo{
    
    public void ligar(){
        confereCambio();
        confereceCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void confereceCombustivel(){
        System.out.println("CONFERINDO COMBUSTIVEL");
    }
    private void confereCambio(){
        System.out.println("CONFERINDO CAMBIO");
    }

    public void desligar(){
        System.out.println("Carro desligado");
    }
}
