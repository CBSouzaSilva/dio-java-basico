public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void mudarCanal (int novoCanal){ //usuario defini o canal que deseja
        canal = novoCanal;
    }
    public void aumentarCanal(){ // muda de canal 1 a 1 ordem crescente
        canal++;
    }
    public void diminuirCanal(){ // muda de canal 1 a 1 ordem decrescente 
        canal--;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: "+volume);
    }
    public void abaixarVolume(){
        volume--;
        System.out.println("Abaixando o volume para: "+volume);
    }

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}
