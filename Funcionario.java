public class Funcionario {
    private String nome;
    private float salarioHora;

    public Funcionario(String nome, float salarioHora) {
        this.nome = nome;
        this.salarioHora = salarioHora;
    }

    public float calcularSalario(int horasTrabalhadas) {
        return salarioHora * horasTrabalhadas;
    }

    // Getters e Setters (opcional, dependendo da necessidade)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }
}
