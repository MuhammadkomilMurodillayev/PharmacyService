package com.example.pharmacyService.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@MappedSuperclass
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Auditable {

    @Id
    @Column(unique = true)
    private String id;

    @CreatedDate
    @CreationTimestamp
    @Column(columnDefinition = "timestamp default now()", name = "created_at")
    private LocalDateTime createdAt;

    @NonNull
    @Column(name = "created_by")
    private LocalDateTime createdBy;

    @LastModifiedDate
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Column(name = "updated_by")
    private LocalDateTime updatedBy;

    @Column(name = "status", columnDefinition = "int2 default 0")
    private short status;

    @Column(name = "is_deleted", columnDefinition = "numeric default 0")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean deleted;


    public Auditable() {
        this.id = UUID.randomUUID().toString().replace("-", "");
    }

}
