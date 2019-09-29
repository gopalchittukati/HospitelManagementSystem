package com.healthcare.f22b_9healthcare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.f22b_9healthcare.entity.Doctor;
@Repository
public interface DoctorDao extends JpaRepository<Doctor, Long> {

}
