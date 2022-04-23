package com.example.pharmservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Auditable {

    @Id
    @Column(unique = true)
    String id;

    @CreatedDate
    @CreationTimestamp
    @Column(columnDefinition = "timestamp default now()", name = "created_at")
    LocalDateTime createdAt;

    @NonNull
    @Column(name = "created_by")
    LocalDateTime createdBy;

    @LastModifiedDate
    @UpdateTimestamp
    LocalDateTime updatedAt;

    @Column(name = "updated_by")
    LocalDateTime updatedBy;

    @Column(name = "is_deleted", columnDefinition = "NUMERIC default 0")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    boolean deleted;
}
