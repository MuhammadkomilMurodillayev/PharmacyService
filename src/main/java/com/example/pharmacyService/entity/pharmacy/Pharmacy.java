package com.example.pharmacyService.entity.pharmacy;

import com.example.pharmacyService.entity.Auditable;
import com.example.pharmacyService.entity.region.Region;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(schema = "pharmacies")
public class Pharmacy extends Auditable {

    private String name;

    private String description;

    private Double latitude;

    private Double longitude;

    @ManyToOne(fetch = FetchType.EAGER)
    private Region region;

    @Column(name = "status", columnDefinition = "int default 0")
    private short status;

}
