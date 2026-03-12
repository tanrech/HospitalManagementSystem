package com.spring.example.services;

import com.spring.example.Model.MedicalRecord;
import com.spring.example.repository.MedicalRecordDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalRecordService {
    @Autowired
    private MedicalRecordDAO medicalRecordDAO;
    public void createMedicalRecord(MedicalRecord record){

        medicalRecordDAO.addMedicalRecord( record);

    }
}
