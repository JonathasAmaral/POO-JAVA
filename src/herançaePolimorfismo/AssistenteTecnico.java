package herançaePolimorfismo;

public final class AssistenteTecnico extends Assistente{

    private double bonus;

    public AssistenteTecnico(String nome, int cpf, double salario, int matricula, double bonus) {
        super(nome, cpf, salario, matricula);
        this.setBonus(bonus);
    }

    public double getCalculaSalario() {
        return super.getSalario() + bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
}
