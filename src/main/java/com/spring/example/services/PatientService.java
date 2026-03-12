package com.spring.example.services;

import com.spring.example.Model.Patient;
import com.spring.example.repository.PatientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientDAO patientDAO;

    public void registerPatient(Patient patient){
        patientDAO.insertPatient(patient);
    }
}
