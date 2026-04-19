package com.ayaan.PaymentApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class User {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @PrePersist
    public void generateId() {
        if (id == null) {
            id = UUID.randomUUID();
        }
    }


    @Column(name = "full_name",nullable = false)
    private String FullName;

    @Column(unique = true,nullable = false)
    private String email;
    @Column(unique = true,nullable = false)
    private String phone;

    @Column(name="created_at",nullable = false)
    private Date createdAt;

}
