package com.example.pharmservice.entity.medicine;

import com.example.pharmservice.entity.Auditable;
import com.example.pharmservice.enums.DrugType;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Medicine extends Auditable {

    @NonNull
    String name;

    String description;

    @NonNull
    Double price;

    @NonNull
    LocalDateTime expiry;

    @NonNull
    LocalDateTime producedDate;

    @NonNull
    @Enumerated(EnumType.STRING)
    DrugType type;

}
