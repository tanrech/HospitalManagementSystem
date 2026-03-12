package com.spring.example.repository;


import com.spring.example.Model.Doctor;
import com.spring.example.Util.DBconnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
@Repository
public class DoctorDAOImple implements DoctorDAO{
    @Autowired
    private DBconnection dbConnection;


    @Override
    public void addDoctor(Doctor doctor) {

        String sql = "INSERT INTO doctor(firstname,lastname,speciality) VALUES(?,?,?)";

        try {

            Connection con = dbConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, doctor.getFirstName());
            ps.setString(2, doctor.getLastName());
            ps.setString(3, doctor.getSpecialty());

            ps.executeUpdate();

            System.out.println("Doctor inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Doctor> getAllDoctors() {
        return List.of();
    }

    @Override
    public void deleteDoctor(int id) {

    }


}
