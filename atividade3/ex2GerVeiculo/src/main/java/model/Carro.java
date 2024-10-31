package model;

public class Carro extends Veiculo {

    public Carro(String placa, String marca, String modelo, Integer anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        double valorIPVA = 20000 - (2024 - anoFabricacao) * 2000;
        return valorIPVA * 0.04;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro [Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo +
                ", Ano: " + anoFabricacao + ", IPVA: " + calcularIPVA() + "]");
    }
}
