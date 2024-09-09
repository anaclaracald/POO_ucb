package entities;

public class Funcionario {
    private String nome;
    private Double salario;

    public Funcionario(){
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Double aumentoSalario(){
        if (salario>=1 && salario<=1000){
            return salario += (salario * 0.15);
        }else if (salario<=1500){
            return salario += (salario * 0.1);
        }else{
            return salario += (salario * 0.05);
        }
    }

    @Override
    public String toString() {
        return "\nFuncionario:" +
                "\nNome: '" + nome + '\'' +
                "\nSalario: " + salario +
                '\n';
    }
}
