package com.pruebas.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name = "patients")
@Builder
public class Patient {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    @NonNull
    private String name;

    @NonNull
    private Integer age;

    @NonNull
    private String email;

}
