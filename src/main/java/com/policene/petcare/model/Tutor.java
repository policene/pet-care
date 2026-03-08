package com.policene.petcare.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tutors")
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "user_id", unique = true)
    private User user;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "cpf", nullable = false, length = 11, unique = true)
    private String cpf;

    @Column(name = "phone", nullable = false, length = 11)
    private String phone;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "tutor")
    private List<Pet> pets;

    @Column(name = "active")
    private boolean active = true;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist () {
        this.createdAt = LocalDateTime.now();
    }

}
