package com.week2u.casestudy.controller;

import com.week2u.casestudy.domain.BankAccount;
import com.week2u.casestudy.dto.AppResponse;
import com.week2u.casestudy.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/bank")
@RestController
public class BankController
{
    @Autowired
    private BankService service;
   @PostMapping
    public ResponseEntity<AppResponse<Integer>> createBankAccount(@RequestBody BankAccount ba){
       service.createNewAccount(ba);
        var response =new AppResponse<Integer>();
        response.setMsg("Account created successfully");
        response.setSts("success");
        response.setbody(0);
        return ResponseEntity.ok(response);

    }
    @PutMapping
    public ResponseEntity<AppResponse<Double>> withdrawMoney(@RequestBody BankAccount ba){
       double amt=service.withdraw(ba.getAcNum(),ba.getBalance());
       var response=new AppResponse<Double>();
       response.setMsg("Account created Successfully");
       response.setSts("success");
       response.setbody(amt);
       return new ResponseEntity<>(response, HttpStatus.ACCEPTED);
    }
   public ResponseEntity<AppResponse<Boolean>> activateAccount(@RequestBody BankAccount ba) {
       boolean acNum = service.activateAccount(ba.getAcNum());
       var response = new AppResponse<Boolean>();
       response.setMsg("Account is Accivated");
       response.setSts("success");
       response.setbody(acNum);
       return new ResponseEntity<>(response, HttpStatus.ACCEPTED);

   }
}
