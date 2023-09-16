package nitish.project.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nitish.project.entity.Employee;
import nitish.project.repo.EmployeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class EmployeeService {
    @Autowired
    EmployeRepo repo;

    public String addEmployee(Employee employee) {
        repo.add(employee);
        return "added employee";

    }

    public List<Employee> getEmp() {
        return repo.employeRepo;
    }

    public Employee getEmployeeById(Integer id) {
        return repo.getById(id);
    }

    public String deleteEmployeeById(Integer id) {
        return repo.deleteByid(id);
    }

    public String updateEmployee(Integer id,Employee employee) {
        return repo.update(id,employee);
    }
}
