package nitish.project.repo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nitish.project.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Repository
public class EmployeRepo {
    @Autowired
     public ArrayList<Employee> employeRepo;


    public void add(Employee employee) {
        employeRepo.add(employee);
    }


    public Employee getById(Integer id) {
        for(Employee emp: employeRepo){
            if(emp.getUserId().equals(id))
                return emp;
        }
        return null;
    }

    public String deleteByid(Integer id) {
        for(Employee emp: employeRepo){
            if(emp.getUserId().equals(id)){
                employeRepo.remove(emp);
            return "employe deleted";
            }
        }
        return "invalid id";
    }

    public String update(Integer id,Employee employee) {
        for(Employee emp:employeRepo){
            if(emp.getUserId().equals(id)){
                emp.setName(employee.getName());
                emp.setAddress(employee.getAddress());
                emp.setUserId(employee.getUserId());
                emp.setUserName(employee.getUserName());
                emp.setNumber(employee.getNumber());
                return "user updated";
            }
        }
        return "wrong id";
    }
}
