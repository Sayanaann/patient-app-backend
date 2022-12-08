package com.example.patientapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient")
public class patient {

    @Id
    @GeneratedValue
    private int id;
    private String patientname;
    private String address;
    private String contactno;
    private String dateofappoinment;
    private String doctorname;


    public patient() {
    }

    public patient(int id, String patientname, String address, String contactno, String dateofappoinment, String doctorname) {
        this.id = id;
        this.patientname = patientname;
        this.address = address;
        this.contactno = contactno;
        this.dateofappoinment = dateofappoinment;
        this.doctorname = doctorname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getDateofappoinment() {
        return dateofappoinment;
    }

    public void setDateofappoinment(String dateofappoinment) {
        this.dateofappoinment = dateofappoinment;
    }

    public String getDoctorname() {
        return doctorname;
    }

    public void setDoctorname(String doctorname) {
        this.doctorname = doctorname;
    }
}
