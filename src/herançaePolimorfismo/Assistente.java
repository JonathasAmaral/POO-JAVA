package herançaePolimorfismo;

public abstract class Assistente extends Funcionario{

    private int matricula;

    public Assistente(String nome, int cpf, double salario, int matricula) {
        super(nome, cpf, salario);
        this.matricula = matricula;
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() + "Matricula:" + matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
