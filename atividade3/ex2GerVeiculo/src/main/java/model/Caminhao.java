package model;

public class Caminhao extends Veiculo {
    public Caminhao(String placa, String marca, String modelo, Integer anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        double valorIPVA = 50000 - (2024 - anoFabricacao) * 5000;
        return valorIPVA * 0.015;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Caminhão [Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo +
                ", Ano: " + anoFabricacao + ", IPVA: " + calcularIPVA() + "]");
    }
}
