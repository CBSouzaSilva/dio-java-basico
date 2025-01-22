public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    //construtor

    //este é um objeto vazio
    Carro(){

    }

    //este é um objeto com valores iniciais definidos

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){//<-- este get deve ter o mesmo tipo
        return cor;//<-- que seu retorno
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}
