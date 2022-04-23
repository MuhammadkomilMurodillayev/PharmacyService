package com.example.pharmservice.entity.country;

import com.example.pharmservice.entity.Auditable;
import com.example.pharmservice.entity.region.Region;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Country extends Auditable {

    @NonNull
    private String name;

    @NonNull
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY)
    private List<Region> regions;
}
