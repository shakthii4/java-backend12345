package com.sakthi.project.repository;

import com.sakthi.project.domain.Patient;
import com.sakthi.project.dto.PatientDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.time.LocalDate;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>
{

     List<Patient> findByLastVisited(LocalDate backdate);

    @Query(value = "select  from patient where name = :name", nativeQuery = true)
     List<PatientDto> findByName(@Param("name") String name);



}
