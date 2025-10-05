package com.rp2025.employee.api;

import com.rp2025.employee.entity.Employee;
import com.rp2025.employee.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
    private final EmployeeService service;
    public EmployeeRestController(EmployeeService service) { this.service = service; }

    @GetMapping
    public List<Employee> all() { return service.findAll(); }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> byId(@PathVariable Long id) {
        return service.findById(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Employee create(@RequestBody Employee e) { return service.add(e); }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> update(@PathVariable Long id, @RequestBody Employee e) {
        return service.update(id, e) ? ResponseEntity.ok(e) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        return service.delete(id) ? ResponseEntity.noContent().build()
                : ResponseEntity.notFound().build();
    }
}
