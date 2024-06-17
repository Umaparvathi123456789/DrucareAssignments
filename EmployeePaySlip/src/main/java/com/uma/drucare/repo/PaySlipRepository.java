package com.uma.drucare.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uma.drucare.entity.PaySlip;

@Repository
public interface PaySlipRepository extends JpaRepository<PaySlip, Long>  {


}
