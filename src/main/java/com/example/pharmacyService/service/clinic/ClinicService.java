package com.example.pharmacyService.service.clinic;

import com.example.pharmacyService.criteria.clinic.ClinicCriteria;
import com.example.pharmacyService.dto.clinic.ClinicCreateDto;
import com.example.pharmacyService.dto.clinic.ClinicDto;
import com.example.pharmacyService.dto.clinic.ClinicUpdateDto;
import com.example.pharmacyService.mapper.clinic.ClinicMapper;
import com.example.pharmacyService.repository.clinic.ClinicRepository;
import com.example.pharmacyService.service.AbstractService;
import com.example.pharmacyService.service.BaseCrudService;
import com.example.pharmacyService.validation.clinic.ClinicValidator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicService
        extends AbstractService<
        ClinicRepository,
        ClinicMapper,
        ClinicCriteria,
        ClinicValidator>

        implements BaseCrudService<
        ClinicDto,
        ClinicCreateDto,
        ClinicUpdateDto,
        ClinicCriteria,
        String>{

    @Override
    public String create(ClinicCreateDto dto) {
        validation.checkCreteDto(dto);
        return null;
    }

    @Override
    public ClinicDto update(ClinicUpdateDto dto) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ClinicDto get(String id) {
        return null;
    }

    @Override
    public List<ClinicDto> getAll(ClinicCriteria criteria) {
        return null;
    }
}
