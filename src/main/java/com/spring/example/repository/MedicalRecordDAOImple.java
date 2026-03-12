package com.spring.example.repository;

import com.spring.example.Model.MedicalRecord;
import com.spring.example.Util.DBconnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
@Repository
public class MedicalRecordDAOImple implements MedicalRecordDAO{
    @Autowired
    private DBconnection dbConnection;
    @Override
    public void addMedicalRecord(MedicalRecord record) {
        String sql = "INSERT INTO medical_records(patient_id, diagnosis, treatment, record_date) VALUES(?,?,?,?)";

        try {

            Connection conn = dbConnection.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, record.getPatientId());
            ps.setString(2, record.getDiagnosis());
            ps.setString(3, record.getTreatment());
            ps.setDate(4, record.getRecordDate());

            ps.executeUpdate();

            System.out.println("Medical record inserted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
