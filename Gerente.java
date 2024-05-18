public class Gerente extends Funcionario {
    public Gerente(String nome, float salarioHora) {
        super(nome, salarioHora);
    }

    @Override
    public float calcularSalario(int horasTrabalhadas) {
        float salarioBase = super.calcularSalario(horasTrabalhadas);
        return salarioBase * 1.05f; // Incremento de 5% para gerentes
    }
}
