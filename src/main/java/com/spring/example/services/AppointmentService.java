package com.spring.example.services;

import com.spring.example.Model.Appointment;
import com.spring.example.repository.AppointmentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentDAO appointmentDAO;
    public void createAppointment(Appointment appointment){

        appointmentDAO.insertAppointment(appointment);

    }
}
