package com.pruebas.demo.repositories;

import com.pruebas.demo.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
