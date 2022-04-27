package com.example.pharmacyService.entity.medicine;

import com.example.pharmacyService.entity.Auditable;
import com.example.pharmacyService.enums.DrugType;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(schema = "medicines")
public class Medicine extends Auditable {

    private String name;

    private String description;

    private Double price;

    private LocalDateTime expiry;

    private LocalDateTime producedDate;

    @Enumerated(EnumType.STRING)
    private DrugType type;

}
