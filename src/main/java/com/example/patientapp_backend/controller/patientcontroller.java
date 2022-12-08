package com.example.patientapp_backend.controller;

import com.example.patientapp_backend.dao.patientdao;
import com.example.patientapp_backend.model.patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class patientcontroller {
    @Autowired
    private patientdao dao;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Homepage(){
        return "welcome to patientapp";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/add",consumes = "application/json",produces = "application/json")
    public String Addpatient(@RequestBody patient p){
        dao.save(p);
        return "patient added";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<patient>viewall(){
        return (List<patient>) dao.findAll();
    }

    @CrossOrigin(origins = "*")

    @PostMapping(path = "/search", consumes = "application/json", produces = "application/json")
    public List<patient> Searchpatient(@RequestBody patient p) {
        String patientname = String.valueOf(p.getPatientname());
        System.out.println(patientname);
        return (List<patient>) dao.Searchpatient(p.getPatientname());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/delete", consumes = "application/json", produces = "application/json")
    public HashMap<String,String> deletepatient(@RequestBody patient p) {
        String id = String.valueOf(p.getId());
        System.out.println(id);
        dao.deletepatient(p.getId());
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }
}
