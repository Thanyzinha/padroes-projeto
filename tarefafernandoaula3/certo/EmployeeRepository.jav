package solid.srp.correct;

// ✅ Classe responsável apenas por salvar no banco de dados
public class EmployeeRepository {
    public void saveToDatabase(Employee employee) {
        System.out.println("Salvando funcionário no banco de dados: " + employee.getName());
    }
}
