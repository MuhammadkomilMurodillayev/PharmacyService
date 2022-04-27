package com.example.pharmacyService.entity.organization;

import com.example.pharmacyService.entity.Auditable;
import com.example.pharmacyService.entity.region.Region;
import io.swagger.v3.oas.annotations.tags.Tags;
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

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;

}
