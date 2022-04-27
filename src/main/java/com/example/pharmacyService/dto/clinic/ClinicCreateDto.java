package com.example.pharmacyService.dto.clinic;

import com.example.pharmacyService.dto.BaseDto;
import com.example.pharmacyService.entity.region.Region;
import lombok.*;
import org.springdoc.api.annotations.ParameterObject;

@ParameterObject
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClinicCreateDto extends BaseDto {

    private String name;

    private Double latitude;

    private Double longitude;

    private Region region;

}
