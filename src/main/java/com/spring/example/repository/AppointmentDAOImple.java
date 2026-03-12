package com.spring.example.repository;

import com.spring.example.Model.Appointment;
import com.spring.example.Util.DBconnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
@Repository
public class AppointmentDAOImple implements AppointmentDAO{
    @Autowired
    private DBconnection dbConnection;

    @Override
    public void insertAppointment(Appointment appointment) {
        String sql = "INSERT INTO appointments(doctor_id, patient_id, appointment_date, reason, status) VALUES(?,?,?,?,?)";

        try {

            Connection conn = dbConnection.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, appointment.getDoctorId());
            ps.setInt(2, appointment.getPatientId());
            ps.setDate(3, appointment.getAppointmentDate());
            ps.setString(4, appointment.getReason());
            ps.setString(5, appointment.getStatus());

            ps.executeUpdate();

            System.out.println("Appointment inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
