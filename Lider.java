public class Lider extends Funcionario {
    public Lider(String nome, float salarioHora) {
        super(nome, salarioHora);
    }

    @Override
    public float calcularSalario(int horasTrabalhadas) {
        float salarioBase = super.calcularSalario(horasTrabalhadas);
        return salarioBase * 1.02f; // Incremento de 2% para líderes
    }
}
