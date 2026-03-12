package com.spring.example;

import com.spring.example.Appconfig.AppConfig;
import com.spring.example.Model.Doctor;
import com.spring.example.services.DoctorService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        DoctorService doctorService = context.getBean(DoctorService.class);

        Doctor doctor = new Doctor(1,"John","Doe","Cardiology");

        doctorService.registerDoctor(doctor);

        System.out.println("Doctor inserted using Spring!");

    }
}