package com.example.pharmacyService.entity.country;

import com.example.pharmacyService.entity.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(schema = "countries")
public class Country extends Auditable {

    @NonNull
    private String name;

}
