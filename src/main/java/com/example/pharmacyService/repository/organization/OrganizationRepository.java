package com.example.pharmacyService.repository.organization;

import com.example.pharmacyService.entity.organization.Clinic;
import com.example.pharmacyService.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationRepository extends JpaRepository<Clinic, String>, BaseRepository {
}
