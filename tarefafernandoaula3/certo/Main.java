package certo;

public class Main {
    public static void main(String[] args) {
        // Criando um funcionário
        Employee employee = new Employee("João", 5000);

        // Calculando salário
        SalaryCalculator calculator = new SalaryCalculator();
        double newSalary = calculator.calculateSalary(employee);
        System.out.println("Novo salário de " + employee.getName() + ": " + newSalary);

        // Salvando no banco de dados
        EmployeeRepository repository = new EmployeeRepository();
        repository.saveToDatabase(employee);
    }
}
