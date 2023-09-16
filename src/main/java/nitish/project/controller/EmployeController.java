package nitish.project.controller;

import nitish.project.entity.Employee;
import nitish.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
public class EmployeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("post/employe")
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);

    }
    @GetMapping("get/employee")
    public List<Employee> getEmployee(){
        return employeeService.getEmp();
    }
    @GetMapping("get/byId/{id}")
    public Employee getEmployeById(@PathVariable Integer id){
        return employeeService.getEmployeeById(id);

    }
    @DeleteMapping("delete/id/{id}")
    public String deleteEmployeById(@PathVariable Integer id){
        return employeeService.deleteEmployeeById(id);

    }
    public String updateEmploye(Integer id, Employee employee){
        return employeeService.updateEmployee(id,employee);
    }


}
