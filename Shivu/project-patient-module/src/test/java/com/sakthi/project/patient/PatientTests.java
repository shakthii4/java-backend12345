package com.sakthi.project.patient;

import com.sakthi.project.domain.Patient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PatientTests
{
    @DisplayName("Testing Object Nullability")
    @Test
    void testInValidObject() {
        Patient pa = null;
        Assertions.assertNull(pa);
    }
    @DisplayName("Patient Valid Object")
    @Test
    void testPatientValidObject() {
        Patient pat = new Patient();
        Assertions.assertNotNull(pat);
    }

    @DisplayName("Domain : Checking getters and setters")
    @Test
    void testObjectGettersSetters() {
        var patient = new Patient();
        patient.setId(1L);
        patient.setName("Shakthi");
        patient.setMobile(12345L);
        patient.setAge(19L);
        patient.setStatus(false);
        patient.setLastVisited(LocalDate.of(2022,1,12));
        Assertions.assertEquals(1L, patient.getId());
        Assertions.assertEquals("Shakthi" , patient.getName());
        Assertions.assertEquals(19L,patient.getAge());
        Assertions.assertEquals(false,patient.getStatus());
        Assertions.assertEquals(12345L, patient.getMobile());
    }
}
