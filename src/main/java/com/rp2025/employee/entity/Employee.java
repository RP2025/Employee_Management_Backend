package com.rp2025.employee.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees")
@Data @NoArgsConstructor @AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false, unique=true)
    private String email;

    private String phone;
    private String department;
}
