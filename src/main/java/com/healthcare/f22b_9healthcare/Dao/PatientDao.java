package com.healthcare.f22b_9healthcare.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.healthcare.f22b_9healthcare.entity.Patient;
@Repository
public interface PatientDao extends JpaRepository<Patient , Long> {

	@Query("select  p.name , di.name , d.name from Medication m "
			+ "join m.medicne me "
			+ "join m.complaint c "
			+ "join c.disease di "
			+ "join c.visiting v "
			+ "join v.appointment a "
			+ "join v.doctor d "
			+ "join a.patient p "
			+ "where me.name=?1")
	public List<Object[]> getPatientByMedicineName(String medicineName);
}
