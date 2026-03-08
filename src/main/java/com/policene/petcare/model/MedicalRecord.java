package com.policene.petcare.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "medical_record")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class MedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "appointment_id", unique = true, nullable = false)
    private Appointment appointment;

    @Column(name = "symptoms", nullable = false, length = 2000)
    private String symptoms;

    @Column(name = "diagnosis", nullable = false, length = 2000)
    private String diagnosis;

    @Column(name = "treatment", nullable = false, length = 2000)
    private String treatment;

    @Column(name = "prescriptions", length = 2000)
    private String prescriptions;

    @Column(name = "follow_up_date")
    private LocalDate followUpDate;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist () {
        this.createdAt = LocalDateTime.now();
    }

}
