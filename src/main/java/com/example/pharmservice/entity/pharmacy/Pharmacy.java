package com.example.pharmservice.entity.pharmacy;

import com.example.pharmservice.entity.Auditable;
import com.example.pharmservice.entity.region.Region;
import lombok.*;


import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pharmacy extends Auditable {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id")
    private Region region;

    @Column(name = "status", columnDefinition = "int default 0")
    private short status;

}
