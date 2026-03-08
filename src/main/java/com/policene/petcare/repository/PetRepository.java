package com.policene.petcare.repository;

import com.policene.petcare.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository <Pet, Long> {
}
