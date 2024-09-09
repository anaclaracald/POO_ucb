package entities;

public class Triangulo {
    private String nome;
    private Double ladoA;
    private Double ladoB;
    private Double ladoC;

    public Triangulo(){
    }

    public Triangulo(String nome, Double ladoA, Double ladoB, Double ladoC) {
        this.nome = nome;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    public String getNome() {
        return nome;
    }

    public Double areaTriangulo(){
        double p = (ladoA +ladoB + ladoC) / 2;
        return Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
    }

    public Triangulo maiorArea(Triangulo other){
        if(this.areaTriangulo() > other.areaTriangulo()){
            return this;
        }else {
            return other;
        }
    }

    @Override
    public String toString() {
        return "O triângulo com maior área é: " + nome;
    }

}
