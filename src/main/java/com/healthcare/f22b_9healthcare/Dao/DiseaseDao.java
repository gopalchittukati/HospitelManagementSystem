package com.healthcare.f22b_9healthcare.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.healthcare.f22b_9healthcare.entity.Disease;

@Repository
public interface DiseaseDao extends JpaRepository<Disease,Long> {

}
