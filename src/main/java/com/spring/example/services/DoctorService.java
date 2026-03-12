package com.spring.example.services;

import com.spring.example.Model.Doctor;
import com.spring.example.repository.DoctorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorService {
    @Autowired
    private DoctorDAO doctorDAO;

    public void registerDoctor(Doctor doctor){
        doctorDAO.addDoctor(doctor);
    }
    public List<Doctor> getAllDoctors(){
        return doctorDAO.getAllDoctors();
    }
    public void deleteDoctor(int id){
        doctorDAO.deleteDoctor(id);
    }
}
