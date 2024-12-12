public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        
        System.out.println("Canal Atual : " + smartTV.canal);
        System.out.println("Volume Atual : " + smartTV.volume);

        smartTV.ligar();//liga a tv
        System.out.println("Novo Status-> TV Ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();//aumenta o volume em 1
        smartTV.aumentarVolume();//aumenta o volume em 1
        smartTV.aumentarVolume();//aumenta o volume em 1
        smartTV.abaixarVolume();//abaixa volume em 1
        System.out.println("Volume Atual: "+smartTV.volume);

        System.out.println("Canal Atual : " + smartTV.canal);
        smartTV.mudarCanal(13); //o usuário defini o canal desejado
        System.out.println("Canal Atual : " + smartTV.canal);

        smartTV.aumentarCanal(); //muda de canal para o próximo 1 por vez
        smartTV.aumentarCanal(); //muda de canal para o próximo 1 por vez
        smartTV.diminuirCanal(); //muda de canala para o anterior 1 por vez
        System.out.println("Canal Atual : " + smartTV.canal);


        smartTV.desligar();//desliga a tv
        System.out.println("Novo Status-> TV Ligada? " + smartTV.ligada);


    }
}
