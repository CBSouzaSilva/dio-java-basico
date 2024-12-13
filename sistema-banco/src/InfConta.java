public class InfConta {
    //variavel da classe conta
    double saldo = 10.0;
    public void sacar (Double valor){
        //variavel local do método sacar
        double novoSaldo = saldo - valor;
        saldo = novoSaldo;

    }
    public void imprimirSaldo(){
        //disponível em toda classe
        System.out.println(saldo);

        //somente o método sacar conhece esta variável
        //System.out.println(novoSaldo);
    }
    public double calcularDividaExponencial(){
        //variável local de método
        double  valorParcela = 50.0;
        double  valorMontante = 0.0;
        for(int x=1; x<=5; x++){
            double valorCalculdo = valorParcela * x;
            valorMontante = valorMontante +  valorCalculdo;
        }
                //escopo de fluxo
        //x e valorCalculado nunca estarão dispovíveis fora do bloco calcularDividaExponencial
        return valorMontante;
    }

    public void imprimirDivida(){
        System.out.println(calcularDividaExponencial());
    }
}
