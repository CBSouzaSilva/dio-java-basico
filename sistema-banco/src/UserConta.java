public class UserConta {
    public static void main(String[] args) {
        InfConta infConta = new InfConta();
        infConta.sacar(5.0);
        infConta.imprimirSaldo();

        infConta.calcularDividaExponencial();
        infConta.imprimirDivida();
    }

}
