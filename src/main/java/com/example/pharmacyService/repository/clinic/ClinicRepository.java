package com.example.pharmacyService.repository.clinic;

import com.example.pharmacyService.entity.clinic.Clinic;
import com.example.pharmacyService.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicRepository extends JpaRepository<Clinic, String>, BaseRepository {
}
