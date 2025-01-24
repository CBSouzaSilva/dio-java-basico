public class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); //estaciei o objeto dentro da classe

        Funcionario gerente = new Gerente(); //upcast
        Funcionario vendedor = new Vendedor(); //upcast
        Funcionario faxineiro = new Faxineiro(); //upcast

        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario(); //downcast
        /*
        evitar trabalhar com downcast em POO, dá erro e é muito complexo de usar de forma
        consistente.
         */
    }
}
