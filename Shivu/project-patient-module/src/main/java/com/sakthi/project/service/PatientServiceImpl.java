package com.sakthi.project.service;

import com.sakthi.project.exception.UserNotFoundException;
import com.sakthi.project.domain.Patient;
import com.sakthi.project.dto.PatientDto;
import com.sakthi.project.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Transactional(
        isolation = Isolation.READ_UNCOMMITTED,
        rollbackFor = SQLException.class
)
@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository repository;

    @Override
    public PatientDto registerPatient(PatientDto dto) {
        var pa = new Patient();
        pa.setId(dto.getId());
        pa.setName(dto.getName());
        pa.setMobile(dto.getMobile());
        pa.setAge(dto.getAge());
        pa.setStatus(dto.getStatus());
        pa.setLastVisited(dto.getLastVisited());
        repository.save(pa);
        return dto;


    }

    @Override
    public PatientDto updatePatient(PatientDto dto) {
        Patient patient = repository.findById(dto.getId()).orElse(null);
        var patient1 = new Patient();
        patient1.setId(dto.getId());
        patient1.setName(dto.getName());
        patient1.setMobile(dto.getMobile());
        patient1.setAge(dto.getAge());
        patient1.setStatus(dto.getStatus());
        patient1.setLastVisited(dto.getLastVisited());
        repository.save(patient1);
        return dto;


    }

    @Override
    public void deletePatient(Long id) {
        repository.deleteById(id);
    }

    @Override
    public PatientDto findPatientId(Long id) {
        return null;
    }

    @Override
    public List<PatientDto> findByName(String name)
    {
        var object = repository.findByName(name);
        if (object.isEmpty()) {
            throw new UserNotFoundException("User Not Found Searched By this Name : " + name);
        }

        List<PatientDto> pt = new ArrayList<>();
        for (int i = 0; i < object.size(); i++) {
            PatientDto patient = object.get(i);
            PatientDto obj = new PatientDto(
                    patient.getId(),
                    patient.getName(),
                    patient.getMobile(),
                    patient.getAge(),
                    patient.getStatus(),
                    patient.getLastVisited()
            );
            pt.add(obj);
        }
        return pt;
    }


    @Override
    public List<PatientDto> visitedTenDaysBack()
    {
        LocalDate dt = LocalDate.now();
        LocalDate backDate = dt.minusDays(10);
        List<Patient> patients = repository.findByLastVisited(backDate);
        List<PatientDto> patientDtos = new ArrayList<>();

        for(int i=0;i<patients.size();i++) {
            Patient patient1 = patients.get(i);
            PatientDto dto = new PatientDto(

                    patient1.getId(),
                    patient1.getName(),
                    patient1.getMobile(),
                    patient1.getAge(),
                    patient1.getStatus(),
                    patient1.getLastVisited()
            );
            patientDtos.add(dto);
        }
        return patientDtos;
    }


}
