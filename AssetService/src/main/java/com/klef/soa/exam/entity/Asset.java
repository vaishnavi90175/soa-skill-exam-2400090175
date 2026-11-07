package com.klef.soa.exam.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long assetId;

    private String name;
    private String type;
    private String status;
    private String location;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    public void createDate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    public void updateDate() {
        updatedAt = LocalDateTime.now();
    }
}