/*
A partir da hora do dia, informe a mensagem adequada:
Bom dia, Boa tarde e Boa noite.
 */
public class Mensagem {
    public static void saudacao(int hora) {
        if (hora >= 0 & hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 & hora < 18) {
            System.out.println("Boa tarde!");
        } else {// (hora >= 18 & hora<24){
            System.out.println("Boa noite!");
        }

    }
}
