package certo;

// ✅ Classe responsável apenas por calcular o salário
public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.getSalary() * 1.1; // Adicionando 10% de bônus
    }
}
