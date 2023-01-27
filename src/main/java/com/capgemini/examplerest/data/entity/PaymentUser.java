package com.capgemini.examplerest.data.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data
@AllArgsConstructor
public class PaymentUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Nonnull
    private String name;
    @Nonnull
    private String lastName;
    @Column(name = "codice_fiscale", nullable = false, unique = true)
    private String taxId;

    public PaymentUser() {

    }
}

