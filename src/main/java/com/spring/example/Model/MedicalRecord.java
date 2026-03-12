package com.spring.example.Model;

import java.sql.Date;

public class MedicalRecord {
    private int id;
    private int patientId;
    private int doctorId;
    private String diagnosis;
    private String treatment;
    private Date recordDate;
    public MedicalRecord(int id, int patientId, String diagnosis, String treatment, Date recordDate) {
        this.id = id;
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.recordDate = recordDate;
    }

    public int getId() {
        return id;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

}
