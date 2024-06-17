package com.uma.drucare.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uma.drucare.entity.Employee;
import com.uma.drucare.entity.PaySlip;
import com.uma.drucare.service.PaySlipService;

@Controller
@RequestMapping("/payslip")
public class PaySlipController {
	
@Autowired
PaySlipService paySlipService;

@PostMapping("/employee/{employeeId}")
public ResponseEntity<?> addPaySlip(@RequestBody PaySlip paySlip, @PathVariable Long employeeId) {
   paySlip.setEmployee(new Employee(employeeId, "", "", ""));
paySlipService.addPaySlip(paySlip);
       return new ResponseEntity<>("Course added successfully",HttpStatus.CREATED);
}

@GetMapping("/all")
public ResponseEntity<List<PaySlip>> allPaySlips(){
	return new ResponseEntity<>(paySlipService.getAllPaySlips(),HttpStatus.OK);
}

@GetMapping("/employee/{employeeId}/payslip/{paySlipId}")
public ResponseEntity<PaySlip> getPaySlip(@PathVariable Long employeeId, @PathVariable Long paySlipId) {
    Optional<PaySlip> paySlipDetails = paySlipService.getPaySlip(paySlipId);
    if (paySlipDetails.isPresent()) {
        return new ResponseEntity<>(paySlipDetails.get(), HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

@DeleteMapping("/employee/{paySlipId}")
public ResponseEntity<String> deletePaySlip(@PathVariable Long paySlipId) {
    paySlipService.deletePaySlip(paySlipId);
    return new ResponseEntity<>("Deleted sucessfully", HttpStatus.OK);
}

@PutMapping("/employee/{employeeId}/{payslipId}")
public ResponseEntity<String> updatePaySlip(@RequestBody PaySlip paySlip, @PathVariable Long payslipId) {
    try {
        paySlipService.updatePaySlip(paySlip, payslipId);
        return new ResponseEntity<>("Updated successfully", HttpStatus.OK);
    } catch (RuntimeException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}

//@PostMapping("/add")
//public ResponseEntity<PaySlip> addPaySlip(@RequestBody PaySlip paySlip) {
//	return new ResponseEntity<>(paySlipService.newPaySlip(paySlip),HttpStatus.OK);
//}
//@GetMapping("/all")
//public ResponseEntity<List<PaySlip>> allPaySlips(){
//	return new ResponseEntity<>(paySlipService.allPaySlips(),HttpStatus.OK);
//}
//@GetMapping("/{paySlipId}")
//public ResponseEntity<PaySlip> getPaySlip(@PathVariable Long paySlipId) {
//Optional<PaySlip> PaySlip=paySlipService.getPaySlip(paySlipId);
//	return PaySlip.map(details -> new ResponseEntity<>(details, HttpStatus.OK))
//            .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//}
//@PutMapping("/update/{PaySlipId}")
//public  ResponseEntity<PaySlip>  updatePaySlip(@RequestBody PaySlip paySlip, @PathVariable Long paySlipId) {
//	Optional<PaySlip> paySlipDetails= paySlipService.updatePaySlip(paySlip,paySlipId);
//	return paySlipDetails.map(details->new ResponseEntity<>(details, HttpStatus.OK))
//            .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//}
//@DeleteMapping("delete/{paySlipId}")
//public ResponseEntity<String> deletePaySlip(@PathVariable Long paySlipId) {
//	return new ResponseEntity<>(paySlipService.deletePaySlip(paySlipId),HttpStatus.OK);
//}
}
