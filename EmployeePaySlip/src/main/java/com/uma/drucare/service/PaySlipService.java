package com.uma.drucare.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uma.drucare.entity.PaySlip;
import com.uma.drucare.repo.PaySlipRepository;

@Service
public class PaySlipService {
	
@Autowired
PaySlipRepository paySlipRepository;

//PostMapping to add details
public String addPaySlip(PaySlip paySlip) {
	paySlipRepository.save(paySlip);
	return "Course added successfully";
}

//GetMapping to fetch all the details
public List<PaySlip> getAllPaySlips() {
	return paySlipRepository.findAll();
}

//GetMapping to fetch particular Id details
public Optional<PaySlip> getPaySlip(Long paySlipId) {
    return paySlipRepository.findById(paySlipId);
}
//Delete Mapping to delete the details
public String deletePaySlip(Long paySlipId) {
	paySlipRepository.deleteById(paySlipId);
	return "PaySlip deleted successfully";
}
//PutMapping to update the details
public String updatePaySlip(PaySlip newPaySlip, Long payslipId) {
    PaySlip existingPaySlip = paySlipRepository.findById(payslipId)
            .orElseThrow(() -> new RuntimeException("PaySlip not found with id: " + payslipId));
    existingPaySlip.setPayDate(newPaySlip.getPayDate());
    existingPaySlip.setBasicPay(newPaySlip.getBasicPay());
    existingPaySlip.setNetPay(newPaySlip.getNetPay());
    paySlipRepository.save(existingPaySlip);
    return"updated sucessfully";
}	
}

//public PaySlip newPaySlip(PaySlip paySlip) {
//	return paySlipRepository.save(paySlip);
//}
//
//public List<PaySlip> allPaySlips() {
//	return paySlipRepository.findAll();
//}
//
//public Optional<PaySlip> getPaySlip(Long paySlipId) {
//	return paySlipRepository.findById(paySlipId);
//}
//
//public Optional<PaySlip> updatePaySlip(PaySlip paySlip, Long paySlipId) {
//	return paySlipRepository.findById(paySlipId);
//}
//
//public String deletePaySlip(Long paySlipId) {
//		 paySlipRepository.deleteById(paySlipId);
//		 return "deleted";
//}
