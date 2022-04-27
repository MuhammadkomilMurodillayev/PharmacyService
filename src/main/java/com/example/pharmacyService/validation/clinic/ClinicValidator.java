package com.example.pharmacyService.validation.clinic;

import com.example.pharmacyService.dto.clinic.ClinicCreateDto;
import com.example.pharmacyService.exception.NullElementException;
import com.example.pharmacyService.validation.BaseValidation;

public class ClinicValidator implements BaseValidation {

    public void checkCreteDto(ClinicCreateDto dto) {

        if (dto.getLatitude() == null){
            throw new NullElementException("Latitude null");
        }

    }
}
