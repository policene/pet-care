package com.policene.petcare.repository;

import com.policene.petcare.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppoitmentRepository extends JpaRepository <Appointment, Long> {
}
