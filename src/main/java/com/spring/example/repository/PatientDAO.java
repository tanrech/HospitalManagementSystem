package com.spring.example.repository;

import com.spring.example.Model.Patient;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;


public interface PatientDAO {
    void insertPatient(Patient patient);



}
