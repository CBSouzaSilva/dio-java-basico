public class main {
    public static void main(String[] args) {
        Calculadora.soma(3,5);
        Calculadora.subtracao(12.5,5.7);
        Calculadora.multiplicacao(9,10);
        Calculadora.divisao(81,9);


        Mensagem.saudacao(1);
        Mensagem.saudacao(6);
        Mensagem.saudacao(12);
        Mensagem.saudacao(14);
        Mensagem.saudacao(17);
        Mensagem.saudacao(18);
        Mensagem.saudacao(22);
        Mensagem.saudacao(23);


        //Empréstimo

        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
