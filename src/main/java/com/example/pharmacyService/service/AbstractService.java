package com.example.pharmacyService.service;

import com.example.pharmacyService.criteria.BaseCriteria;
import com.example.pharmacyService.mapper.BaseMapper;
import com.example.pharmacyService.repository.BaseRepository;
import com.example.pharmacyService.validation.BaseValidation;

public abstract class AbstractService<
        R extends BaseRepository,
        M extends BaseMapper,
        C extends BaseCriteria,
        V extends BaseValidation>{

    protected R repository;
    protected M mapper;
    protected V validation;
    protected C criteria;



}
