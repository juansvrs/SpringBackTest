package com.pruebas.demo.services;

import com.pruebas.demo.models.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {

    Patient addPatient(Patient patient);

    List<Patient> getAllPatients();

    Optional<Patient> getPatientById(Long patient);

    Patient updatePatient(Patient patient);

    void deletePatient(Long patientId);
}
