class RodarAplicacao {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Rosa");
        carro1.setModelo("Versa SL");
        carro1.setCapacidadeTanque(45);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.10));

        Carro carro2 = new Carro("Verde", "Siena LX", 55);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.10));
        //comentario adicionado para teste
    }
}
