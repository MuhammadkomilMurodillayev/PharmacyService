package com.example.pharmacyService.controller.clinic;

import com.example.pharmacyService.controller.AbstractController;
import com.example.pharmacyService.controller.BaseCrudController;
import com.example.pharmacyService.criteria.clinic.ClinicCriteria;
import com.example.pharmacyService.dto.DataDto;
import com.example.pharmacyService.dto.clinic.ClinicCreateDto;
import com.example.pharmacyService.dto.clinic.ClinicDto;
import com.example.pharmacyService.dto.clinic.ClinicUpdateDto;
import com.example.pharmacyService.service.clinic.ClinicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@PreAuthorize(value = "hasRole('SUPER_ADMIN')")
@RequestMapping("/clinic/")
public class ClinicController
        extends AbstractController<ClinicService>
        implements BaseCrudController<
        ClinicDto,
        ClinicCreateDto,
        ClinicUpdateDto,
        ClinicCriteria,
        String> {


    @PostMapping("create")
    @Override
    public ResponseEntity<DataDto<String>> create(@RequestBody ClinicCreateDto dto) {
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
    public ResponseEntity<DataDto<ClinicDto>> update(@PathVariable(name = "id") ClinicUpdateDto dto) {
        return null;
    }

    @GetMapping("get/{id}")
    @Override
    public ResponseEntity<DataDto<ClinicDto>> get(@PathVariable(name = "id") String id) {
        return null;
    }

    @GetMapping("getAll")
    @Override
    public ResponseEntity<DataDto<List<ClinicDto>>> getAll(@RequestBody ClinicCriteria criteria) {
        return null;
    }
}
