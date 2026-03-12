package com.spring.example.repository;

import com.spring.example.Model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;

@Repository
public class PatientDAOImple implements PatientDAO{
    @Autowired
    private Connection connection;


    @Override
    public void insertPatient(Patient patient) {
        String sql = "INSERT INTO patients(first_name,last_name,gender,phone_number,email) VALUES(?,?,?,?,?)";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, patient.getFirstName());
            ps.setString(2, patient.getLastName());
            ps.setString(3, patient.getGender());
            ps.setString(4, patient.getPhone());
            ps.setString(5, patient.getEmail());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
