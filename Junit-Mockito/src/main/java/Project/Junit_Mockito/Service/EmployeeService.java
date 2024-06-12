package Project.Junit_Mockito.Service;

import java.util.List;

import Project.Junit_Mockito.Model.Employee;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(Long id);
    public Employee updateEmployee(Long employeeId, Employee employee);
    public void deleteEmployeeById(Long id);
}
