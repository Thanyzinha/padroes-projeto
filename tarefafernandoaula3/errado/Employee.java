package errado;

// ❌ Esta classe viola o SRP porque tem múltiplas responsabilidades.
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printReport() {
        // ❌ Responsabilidade de gerar relatório (deveria estar em outra classe)
        System.out.println("Relatório do funcionário: " + name);
    }

    public double calculateSalary() {
        // ❌ Responsabilidade de cálculo de salário (deveria estar em outra classe)
        return salary * 1.1; // Adicionando 10% de bônus
    }

    public void saveToDatabase() {
        // ❌ Responsabilidade de persistência (deveria estar em outra classe)
        System.out.println("Salvando funcionário no banco de dados...");
    }
}
