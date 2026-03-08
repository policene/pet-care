package com.policene.petcare.model;

import com.policene.petcare.model.enums.DayOfWeek;
import com.policene.petcare.model.enums.Specialty;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "veterinarians")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Veterinarian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "user_id", unique = true)
    private User user;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "crmv", nullable = false, unique = true)
    private String crmv;

    @Enumerated(EnumType.STRING)
    private Set<Specialty> specialities;

    @Enumerated(EnumType.ORDINAL)
    private Set<DayOfWeek> dayOfWeeks;

    @Column(name = "active")
    private boolean active = true;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist () {
        this.createdAt = LocalDateTime.now();
    }

}
