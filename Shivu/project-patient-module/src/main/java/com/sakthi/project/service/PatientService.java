package com.sakthi.project.service;

;
import com.sakthi.project.domain.Patient;
import com.sakthi.project.dto.PatientDto;

import java.util.List;

public interface PatientService {

    PatientDto registerPatient(PatientDto dto);

    PatientDto updatePatient(PatientDto dto);

    void deletePatient(Long id);

   // List<PatientDto> findByName(String name);
   PatientDto findPatientId(Long id);

    List<PatientDto> visitedTenDaysBack();


    List<PatientDto> findByName(String name);
}
