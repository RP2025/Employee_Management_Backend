//package com.rp2025.employee.controller;
//
//import com.rp2025.employee.entity.Employee;
//import com.rp2025.employee.service.EmployeeService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class EmployeeController {
//
//    private final EmployeeService employeeService;
//    public EmployeeController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/")
//    public String home() { return "redirect:/employees"; }
//
//    @GetMapping("/employees")
//    public String showEmployees(Model model) {
//        model.addAttribute("employees", employeeService.findAll());
//        return "employees";
//    }
//
//    @PostMapping("/employees/{id}/delete")
//    public String deleteEmployee(@PathVariable Long id) {
//        employeeService.delete(id);           // <-- changed: delete(...)
//        return "redirect:/employees";
//    }
//
//    @PostMapping("/employees/{id}/update")
//    public String updateEmployee(@PathVariable Long id, @ModelAttribute Employee form) {
//        form.setId(id);
//        employeeService.update(id, form);     // <-- changed: update(id, form)
//        return "redirect:/employees";
//    }
//}
