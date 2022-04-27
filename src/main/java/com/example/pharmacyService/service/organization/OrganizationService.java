package com.example.pharmacyService.service.organization;

import com.example.pharmacyService.criteria.organization.OrganizationCriteria;
import com.example.pharmacyService.dto.organization.OrganizationCreateDto;
import com.example.pharmacyService.dto.organization.OrganizationDto;
import com.example.pharmacyService.dto.organization.OrganizationUpdateDto;
import com.example.pharmacyService.mapper.organization.OrganizationMapper;
import com.example.pharmacyService.repository.organization.OrganizationRepository;
import com.example.pharmacyService.service.AbstractService;
import com.example.pharmacyService.service.BaseCrudService;
import com.example.pharmacyService.validation.organization.OrganizationValidator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService
        extends AbstractService<
        OrganizationRepository,
        OrganizationMapper,
        OrganizationCriteria,
        OrganizationValidator>

        implements BaseCrudService<
        OrganizationDto,
        OrganizationCreateDto,
        OrganizationUpdateDto,
        OrganizationCriteria,
        String>{


    @Override
    public String create(OrganizationCreateDto dto) {
        return null;
    }

    @Override
    public OrganizationDto update(OrganizationUpdateDto dto) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public OrganizationDto get(String id) {
        return null;
    }

    @Override
    public List<OrganizationDto> getAll(OrganizationCriteria criteria) {
        return null;
    }
}
