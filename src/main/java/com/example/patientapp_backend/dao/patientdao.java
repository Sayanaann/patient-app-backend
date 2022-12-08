package com.example.patientapp_backend.dao;

import com.example.patientapp_backend.model.patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface patientdao extends CrudRepository<patient,Integer> {
    @Query(value = "SELECT `id`, `address`, `contactno`, `dateofappoinment`, `doctorname`, `patientname` FROM `patient` WHERE `patientname`= :patientname",nativeQuery = true)
    List<patient> Searchpatient(@Param("patientname") String patientname );

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `patient` WHERE `id`= :id",nativeQuery = true)
    void deletepatient(@Param("id") Integer id);


}
