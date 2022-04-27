package com.example.pharmacyService.controller.organization;

import com.example.pharmacyService.controller.AbstractController;
import com.example.pharmacyService.controller.BaseCrudController;
import com.example.pharmacyService.criteria.organization.OrganizationCriteria;
import com.example.pharmacyService.dto.DataDto;
import com.example.pharmacyService.dto.organization.OrganizationCreateDto;
import com.example.pharmacyService.dto.organization.OrganizationDto;
import com.example.pharmacyService.dto.organization.OrganizationUpdateDto;
import com.example.pharmacyService.service.organization.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@PreAuthorize(value = "hasRole('SUPER_ADMIN')")
@RequestMapping("/organization/")
public class OrganizationController
        extends AbstractController<OrganizationService>
        implements BaseCrudController<
        OrganizationDto,
        OrganizationCreateDto,
        OrganizationUpdateDto,
        OrganizationCriteria,
        String> {


    @PostMapping("create")
    @Override
    public ResponseEntity<DataDto<String>> create(@RequestBody OrganizationCreateDto dto) {
        String id = service.create(dto);
        return new ResponseEntity<>(new DataDto<>(id), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    @Override
    public ResponseEntity<DataDto<Void>> delete(@PathVariable(name = "id") String id) {
        service.delete(id);
        return new ResponseEntity<>(new DataDto<>(), HttpStatus.OK);
    }

    @PutMapping("update/{id}")
    @Override
    public ResponseEntity<DataDto<OrganizationDto>> update(@PathVariable(name = "id") OrganizationUpdateDto dto) {
        return null;
    }

    @GetMapping("get/{id}")
    @Override
    public ResponseEntity<DataDto<OrganizationDto>> get(@PathVariable(name = "id") String id) {
        return null;
    }

    @GetMapping("getAll")
    @Override
    public ResponseEntity<DataDto<List<OrganizationDto>>> getAll(@RequestBody OrganizationCriteria criteria) {
        return null;
    }
}
