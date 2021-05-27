package herançaePolimorfismo;

public final class AssistenteAdministrativo extends Assistente{
    
    private TurnoEnum truno;
    private double adicionalNoturno;

    
    public AssistenteAdministrativo(String nome, int cpf, double salario, int matricula, TurnoEnum truno, double adicionalNoturno) {
        super(nome, cpf, salario, matricula);
        this.truno = truno;
        this.adicionalNoturno = adicionalNoturno;
    }


    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }


    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }


    public TurnoEnum getTruno() {
        return truno;
    }


    public void setTruno(TurnoEnum truno) {
        this.truno = truno;
    }


}
