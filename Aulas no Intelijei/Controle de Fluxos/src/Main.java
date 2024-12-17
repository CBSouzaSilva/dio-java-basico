
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
        //Evite efeito flecha
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
                        } else {
                            if(mes == 6){
                                System.out.println("Junho");
                            } else {
                                if (mes == 7){
                                    System.out.println("Julho");
                                }else {
                                    if (mes ==8){
                                        System.out.printf("Agosto");
                                    }else {
                                        if (mes==9){
                                            System.out.println("Setembro");
                                        }else {
                                            if (mes == 10){
                                                System.out.println("Outubro");
                                            }else {
                                                if (mes == 11){
                                                    System.out.println("Novembro");
                                                }else {
                                                    if (mes == 12){
                                                        System.out.println("Dezembro");
                                                    }else {
                                                        System.out.println("Mês não inexistente");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    private static void ifSemFlecha(){

        int mes = 8;
        if(mes ==1){
            System.out.printf("Janeiro");
        } else if (mes == 2) {
            System.out.printf("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.printf("Abriu");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        }else {
            System.out.printf("Mês indefinido!");
        }
    }
    private static void ifFerias(){
        /**
         * NÃO FAZER DESTA FORMA!
         * quando envolve somente 1 variavel (mes) evitar de ficar repetindo em várias comparações desnecessárias
          */
        String mes = "julho";
        if (mes == "julho" || mes == "dezembro" || mes == "janeiro"){
            System.out.println("Férias");
        }
    }
    private static void ifMenor(){

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependendtes = 2;
        //evitar este tipo de solução
        if ((salarioMensal<mediaSalario) && (quantidadeDependentes>=mediaDependendtes)){
            System.out.println("Funcionário deve receber auxílio");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependendtes;
        //opção intermediaria, mas ainda usual
        if ((salarioBaixo) && (muitosDependentes)){
            System.out.println("Funcionario deve receber auxílio");
        }
        // melhor opção para essa situação
        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        if (recebeAuxilio){
            System.out.println("funcionário deve receber auxilio");
        } else {
            System.out.println("Funcionário não deve receber auxílio");
        }
    }

    private static void switchSemana(){

        String dia = "Terça";
        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                break;
            case "Quinta":
                break;
            case "Sexta":
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Não é um dia da semana válido");
//                System.out.println(1);
                break;
        }
    }

    private static void switchNumero(){

        int numero = 4;
        switch (numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;

        }
    }

    private static void switchFerias(){

        String mes = "dezembro";
        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês indefinido");
                break;
        }
    }
}

