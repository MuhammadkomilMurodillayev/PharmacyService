package com.example.pharmacyService.entity.region;

import com.example.pharmacyService.entity.Auditable;
import com.example.pharmacyService.entity.country.Country;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(schema = "regions")
public class Region extends Auditable {

    @Column(name = "name")
    String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "country_id")
    Country country;


}
