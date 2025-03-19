package com.med.voll.clinic.repository;

import com.med.voll.clinic.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

/*
    Using interface that inherits from JpaRepository
    that way is possible to do the same function
    that DAO objects/classes had
 */
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
