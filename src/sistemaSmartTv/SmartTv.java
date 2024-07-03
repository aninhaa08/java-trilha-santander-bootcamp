package sistemaSmartTv;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    //LIGAR OU DESLIGAR

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    //VOLUME

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando para:" + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo para:" + volume);
    }

    //CANAL

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }
}
