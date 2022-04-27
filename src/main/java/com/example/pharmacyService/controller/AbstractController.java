package com.example.pharmacyService.controller;

import com.example.pharmacyService.service.BaseService;
import lombok.Getter;

@Getter
public class AbstractController<S extends BaseService> implements BaseController{
    protected S service;
}
