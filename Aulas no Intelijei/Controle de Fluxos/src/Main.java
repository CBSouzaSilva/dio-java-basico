
public class Main {
    public static void main(String[] args){
        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }
    private static void ifFlecha(){
        int mes =9;
        if (mes == 1){
            System.out.println("Janeiro");
        } else {
            if (mes == 2){
                System.out.println("Fevereiro");
            } else {
                if (mes == 3){
                    System.out.printf("Março");
                } else {
                    if (mes == 4){
                        System.out.println("Abril");
                    } else {
                        if (mes ==  5){
                            System.out.println("Maio");

                        }
                    }
                }
            }
        }
    }

}

