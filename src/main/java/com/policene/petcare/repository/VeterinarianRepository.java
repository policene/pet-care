package com.policene.petcare.repository;

import com.policene.petcare.model.Veterinarian;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinarianRepository extends JpaRepository <Veterinarian, Long> {
}
