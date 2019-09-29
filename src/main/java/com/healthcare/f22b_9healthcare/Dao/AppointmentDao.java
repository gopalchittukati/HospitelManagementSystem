package com.healthcare.f22b_9healthcare.Dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.healthcare.f22b_9healthcare.entity.Appointment;
@Repository
public interface AppointmentDao extends JpaRepository<Appointment, Long> {

@Query("select a.id , a.primaryReason , p.name, p.date, p.phone from Appointment a "
			+ "join a.patient p "
			+ "where a.dateTime=?1")
	public List<Object[]> getAppointAndPatientByDate(Date date);
	
}
