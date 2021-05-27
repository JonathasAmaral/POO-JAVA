package herançaePolimorfismo;

public  abstract class Funcionario {
    
    private String nome;
    private int cpf;
    private double salario;
    
    public Funcionario(String nome,int cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }


    public String exibeDados() {
        return "A identificação do funcionario é:" + "CPF: " + cpf + "," + "Nome: " + nome;
    }

    public String getNome() {
        return nome;
    }
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
