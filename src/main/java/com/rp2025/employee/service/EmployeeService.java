package com.rp2025.employee.service;

import com.rp2025.employee.entity.Employee;
import com.rp2025.employee.repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> findAll() {
        return repo.findAll();
    }

    public Optional<Employee> findById(Long id) {
        return repo.findById(id);
    }

    public Employee add(Employee e) {
        e.setId(null);           // let JPA generate
        return repo.save(e);
    }

    public boolean update(Long id, Employee e) {
        if (!repo.existsById(id)) return false;
        e.setId(id);
        repo.save(e);
        return true;
    }

    public boolean delete(Long id) {
        if (!repo.existsById(id)) return false;
        repo.deleteById(id);
        return true;
    }

    // seed a few rows at startup (optional)
    @PostConstruct
    void seed() {
        if (repo.count() == 0) {
            repo.save(new Employee(null, "Employee One", "emp.one@wf.com", "987654321", "CCIBT"));
            repo.save(new Employee(null, "Employee Two", "emp.two@wf.com", "9123456780", "Finance"));
            repo.save(new Employee(null, "Employee Three", "emp.three@wf.com", "9000000001", "HR"));
        }
    }
}
