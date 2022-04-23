package com.example.pharmservice.entity.region;

import com.example.pharmservice.entity.Auditable;
import com.example.pharmservice.entity.country.Country;
import com.example.pharmservice.entity.pharmacy.Pharmacy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Region extends Auditable {

    @Column(name = "name")
    String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "country_id")
    Country country;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "region")
    List<Pharmacy> pharmacyList;
}
