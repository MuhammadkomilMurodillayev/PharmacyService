package com.example.pharmacyService.dto;

import com.example.pharmacyService.exception.AppError;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataDto<T> implements Serializable {

    protected T data;
    protected AppError error;
    protected Boolean success;
    private Long total;

    public DataDto(T data) {
        this.data = data;
        this.success = true;
    }

    public DataDto(AppError error) {
        this.error = error;
        this.success = false;
    }

    public DataDto(T data, Long total) {
        this.success = true;
        this.data = data;
        this.total = total;
    }
}
