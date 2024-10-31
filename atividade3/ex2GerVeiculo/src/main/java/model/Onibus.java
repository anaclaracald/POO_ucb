package model;

public class Onibus extends Veiculo {

    public Onibus(String placa, String marca, String modelo, Integer anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        double valorIPVA = 40000 - (2024 - anoFabricacao) * 3000;
        return valorIPVA * 0.02;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Ônibus [Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo +
                ", Ano: " + anoFabricacao + ", IPVA: " + calcularIPVA() + "]");
    }
}
