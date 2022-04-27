package com.example.pharmacyService.service;

import com.example.pharmacyService.criteria.BaseCriteria;
import com.example.pharmacyService.dto.BaseDto;
import com.example.pharmacyService.dto.BaseGenericDto;

import java.io.Serializable;
import java.util.List;

public interface BaseCrudService<
        D extends BaseGenericDto,
        CD extends BaseDto,
        UD extends BaseGenericDto,
        C extends BaseCriteria,
        K extends Serializable> extends BaseService {

    K create(CD dto);
    D update(UD dto);
    void delete(K id);
    D get(K id);
    List<D> getAll(C criteria);
}
