package com.sakthi.project.controller;

import com.sakthi.project.exception.UserNotFoundException;
import com.sakthi.project.dto.AppResponse;
import com.sakthi.project.dto.PatientDto;
import com.sakthi.project.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/patient")
@RestController
public class PatientController {
    @Autowired
    private PatientService service;

    @PostMapping
    public ResponseEntity<AppResponse<PatientDto>> registerPatient(@RequestBody PatientDto dto) {

        var svObj = service.registerPatient(dto);
        var response = new AppResponse<PatientDto>();
        response.setStatus("success");
        response.setMessage("Data saved successfully");
        response.setBody(svObj);

        return ResponseEntity.ok(response);
    }

    @PutMapping("/update")
    public ResponseEntity<AppResponse<PatientDto>> updatePatient(@RequestBody PatientDto dto) {
        var svObj = service.updatePatient(dto);
        var response = new AppResponse<PatientDto>();
        response.setStatus("success");
        response.setMessage("Data updated successfully");
        response.setBody(svObj);
        return ResponseEntity.ok(response);


   }

  @GetMapping("/visited")
    public ResponseEntity<AppResponse<List<PatientDto>>> findAllPatient()
    {
        var svOb=service.visitedTenDaysBack();
        var response=new AppResponse<List<PatientDto>>();
        response.setStatus("suceess");
        response.setMessage("Successfully visited 10 Days back");
        response.setBody(svOb);
        return ResponseEntity.ok(response);



    }


    @DeleteMapping("/{id}")
    public ResponseEntity<AppResponse<Long>> deletePatient(@PathVariable Long id) {
        service.deletePatient(id);
        var response = new AppResponse<Long>();
        response.setMessage("Deleted SuccessFully");
        response.setStatus("Success");
        response.setBody(1l);
        return ResponseEntity.ok(response);
    }

   @GetMapping("/find/{name}")
  public ResponseEntity<AppResponse<List<PatientDto>>> findByName(@PathVariable String name)
  {
      try {
          var response = new AppResponse<List<PatientDto>>();
          response.setBody(service.findByName(name));
          response.setMessage(" Patient are Shown By Name Sucessfully");
          response.setStatus("Success");
          return ResponseEntity.ok(response);
      } catch (UserNotFoundException e) {
          var response = new AppResponse<Boolean>();
          response.setBody(false);
          response.setMessage(e.getMessage());
          response.setStatus("Failed");
          return new ResponseEntity(HttpStatus.BAD_REQUEST);
      }


  }


}