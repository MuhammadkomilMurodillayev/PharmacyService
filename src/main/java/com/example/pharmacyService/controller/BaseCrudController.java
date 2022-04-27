package com.example.pharmacyService.controller;

import com.example.pharmacyService.criteria.BaseCriteria;
import com.example.pharmacyService.dto.BaseDto;
import com.example.pharmacyService.dto.BaseGenericDto;
import com.example.pharmacyService.dto.DataDto;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseCrudController<
        D extends BaseGenericDto,
        CD extends BaseDto,
        UD extends BaseGenericDto,
        C extends BaseCriteria,
        K extends Serializable> {

    ResponseEntity<DataDto<K>> create(CD dto);

    ResponseEntity<DataDto<Void>> delete(K id);

    ResponseEntity<DataDto<D>> update(UD dto);

    ResponseEntity<DataDto<D>> get(K id);

    ResponseEntity<DataDto<List<D>>> getAll(C criteria);
}
