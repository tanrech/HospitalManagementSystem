package com.spring.example.repository;

import com.spring.example.Model.Doctor;

import java.util.List;

public interface DoctorDAO {
    void addDoctor(Doctor doctor);

    List<Doctor> getAllDoctors();

    void deleteDoctor(int id);
}
