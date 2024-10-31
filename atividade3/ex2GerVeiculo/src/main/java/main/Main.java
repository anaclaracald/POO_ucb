package main;

import model.Caminhao;
import model.Carro;
import model.Onibus;
import model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("ABC-1234", "Toyota", "Corolla", 2018);
        Veiculo caminhao = new Caminhao("DEF-5678", "Scania", "P310", 2015);
        Veiculo onibus = new Onibus("GHI-9101", "Mercedes-Benz", "OF-1721", 2016);

        Veiculo[] veiculos = { carro, caminhao, onibus };

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
            System.out.println("IPVA: R$" + veiculo.calcularIPVA());
            System.out.println("---------------------------");
        }
    }
}
