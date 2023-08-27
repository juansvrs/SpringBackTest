package com.pruebas.demo.services.impl;

import com.pruebas.demo.models.Patient;
import com.pruebas.demo.repositories.PatientRepository;
import com.pruebas.demo.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

//PARTE PARA EL SERVICE
public class PatientServiceImpl implements PatientService {


    //Inyection of repository+
    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    public Optional<Patient> getPatientById(Long patientId) {
        return patientRepository.findById(patientId);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Long patientId) {
        patientRepository.deleteById(patientId);

    }
}
