public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;
 
    public void Ligar(){
        ligada = true;
    }
    public void Desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void subirCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
}
