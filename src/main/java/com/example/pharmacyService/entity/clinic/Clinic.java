package com.example.pharmacyService.entity.clinic;

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
@Table(schema = "clinics")
public class Clinic extends Auditable {

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "int2 default 0")
    private short status;

    private Double latitude;

    private Double longitude;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

}
