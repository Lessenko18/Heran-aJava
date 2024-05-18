public class Main {
    public static void main(String[] args) {
        Lider lider = new Lider("João", 50);
        float salarioLider = lider.calcularSalario(160);
        System.out.printf("Salário do líder %s: R$%.2f\n", lider.getNome(), salarioLider);

        Gerente gerente = new Gerente("Maria", 60);
        float salarioGerente = gerente.calcularSalario(160);
        System.out.printf("Salário do gerente %s: R$%.2f\n", gerente.getNome(), salarioGerente);
    }
}
